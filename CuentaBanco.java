import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Condition;

// Excepción personalizada para fondos insuficientes
class FondoInsuficiente extends Exception {
    public FondoInsuficiente(String mensaje) {
        super(mensaje);
    }
}

// Clase que representa la cuenta bancaria
public class CuentaBanco {
    private double saldo;
    private final Lock lock = new ReentrantLock();
    private final Condition fondosSuficientes = lock.newCondition();

    public CuentaBanco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método para depositar dinero
    public void depositar(double monto) {
        lock.lock(); // Adquirir el bloqueo
        try {
            saldo += monto;
            System.out.println(Thread.currentThread().getName() + " depositó: $" + monto + ". Saldo actual: $" + saldo);
            fondosSuficientes.signalAll(); // Notificar a los hilos en espera
        } finally {
            lock.unlock(); // Liberar el bloqueo
        }
    }

    // Método para retirar dinero
    public void retirar(double monto) throws FondoInsuficiente {
        lock.lock(); // Adquirir el bloqueo
        try {
            while (saldo < monto) { // Fondos insuficientes
                System.out.println(Thread.currentThread().getName() + " intenta retirar: $" + monto + ". Fondos insuficientes. Esperando depósito...");
                try {
                    fondosSuficientes.await(); // Esperar hasta que haya fondos suficientes
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restaurar estado de interrupción
                    throw new FondoInsuficiente("Operación interrumpida mientras esperaba fondos suficientes.");
                }
            }
            saldo -= monto;
            System.out.println(Thread.currentThread().getName() + " retiró: $" + monto + ". Saldo actual: $" + saldo);
        } finally {
            lock.unlock(); // Liberar el bloqueo
        }
    }

    public static void main(String[] args) {
        CuentaBanco cuenta = new CuentaBanco(100.0); // Saldo inicial

        // Clase interna para realizar depósitos
        class DepositoRunnable implements Runnable {
            private final double[] montos;

            public DepositoRunnable(double[] montos) {
                this.montos = montos;
            }

            @Override
            public void run() {
                for (double monto : montos) {
                    try {
                        Thread.sleep(1000); // Simula tiempo entre depósitos
                        cuenta.depositar(monto);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.err.println("Hilo interrumpido durante el depósito.");
                    }
                }
            }
        }

        // Clase interna para realizar retiros
        class RetiroRunnable implements Runnable {
            private final double[] montos;

            public RetiroRunnable(double[] montos) {
                this.montos = montos;
            }

            @Override
            public void run() {
                for (double monto : montos) {
                    try {
                        Thread.sleep(1500); // Simula tiempo entre retiros
                        cuenta.retirar(monto);
                    } catch (FondoInsuficiente e) {
                        System.err.println(Thread.currentThread().getName() + ": " + e.getMessage());
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.err.println("Hilo interrumpido durante el retiro.");
                    }
                }
            }
        }

        // Montos para depósitos y retiros
        double[] depositos = {50, 100, 70, 30};
        double[] retiros = {60, 200, 40, 100};

        // Crear hilos
        Thread hiloDepositos = new Thread(new DepositoRunnable(depositos), "Hilo-Depósito");
        Thread hiloRetiros = new Thread(new RetiroRunnable(retiros), "Hilo-Retiro");

        // Iniciar los hilos
        hiloDepositos.start();
        hiloRetiros.start();
    }
}
