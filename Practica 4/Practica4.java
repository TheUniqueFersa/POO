import java.util.ArrayList;
class CuentaBanco{
    String nombre, cuenta;
    double saldo;
    final int longnumCuenta = 12;
    ArrayList<Double> movimientos = new ArrayList<>(); //Donde depositos[0] sería el depositoInicial
    public CuentaBanco(String nombre, String cuenta, double depositoInicial){
        this.nombre = nombre;
        if(cuenta.length() > longnumCuenta){
            System.out.println("El numero de cuenta debe tener 12 digitos, por lo que se tomaran los primeros a 12 digitos");
            this.cuenta = cuenta.substring(0, longnumCuenta);
        } else {
            this.cuenta = cuenta;
        }
        if(depositoInicial < 0){
            System.out.println("No se puede depositar una cantidad negativa, la cuenta se creara con saldo 0");
            this.saldo = 0;
        } else{
            this.saldo = depositoInicial;
            registrarMovimiento(depositoInicial);
        }
    }
    public void depositar(double cantidad){
        if(cantidad < 0){
            System.out.println("No se puede depositar una cantidad negativa");
        } else {
            saldo += cantidad;
            registrarMovimiento(cantidad);
        }
    }
    public void registrarMovimiento(Double movimiento){
        movimientos.add(movimiento);
    }
    public void retirar(double cantidad){
        if(cantidad < 0){
            System.out.println("No se puede retirar una cantidad negativa");
        } else{
            if(cantidad > saldo){
                System.out.println("No se puede retirar la cantidad solicitada");
            } else {
                saldo -= cantidad;
                movimientos.add(cantidad*(-1));
            }
        }        
    }
    public void impInfoCuenta(String caso){
        switch (caso) {
            case "Nombre":
                System.out.println("Nombre: " + nombre);                
                break;
            case "Cuenta":
                System.out.println("Numero de cuenta: " + cuenta);
                break;
            case "Saldo":
                System.out.println("Saldo: " + saldo);
                break;
            case "Movimientos":
                System.out.println("Movimientos:");
                impMovimientos();
                break;
            default:
                break;
        }
    }
    public void impMovimientos(){
        if(movimientos.size() == 0){
            System.out.println("No hay movimientos registrados");
        } else {
            int i=1;
            for(Double dep : movimientos){
                System.out.println(i++ + ": " + dep);
            }
        }
        
    }
    public void impInfoCuenta(){
        String formato = "| %-15s | %-12s | %.2f |\n";
        System.out.printf("+-----------------+--------------+------------+\n");
        System.out.printf("| Nombre          | Num. Cuenta  | Saldo      |\n");
        System.out.printf("+-----------------+--------------+------------+\n");
        System.out.printf(formato, nombre, cuenta, saldo);
        System.out.printf("+-----------------+--------------+------------+\n");
        System.out.printf("| %-15s |\n", "Movimientos");
        impMovimientos();
        System.out.printf("+-----------------+\n");
        
    }
}

public class Practica4 {
    public static void main(String [] args){
        System.out.println("== Bienvenido al banco (Practica 4) ==");

        CuentaBanco c1 = new CuentaBanco("Maria Fernanda", "123456", 20000);
        c1.impInfoCuenta();

        c1.depositar(5000.25);
        c1.impInfoCuenta("Saldo");
        System.out.println();
        
        c1.retirar(2500.12);
        c1.impInfoCuenta("Saldo");
        System.out.println();

        c1.depositar(316.87);
        c1.depositar(-12);
        c1.retirar(100000.00);
        c1.impInfoCuenta();

        //---------
        CuentaBanco c2 = new CuentaBanco("Heriberto C.", "988765432123456789", 20000);
        c2.impInfoCuenta("Cuenta");
        System.out.println();


        //---------
        CuentaBanco c3 = new CuentaBanco("Maria Fernanda", "982", -123);
        c3.impInfoCuenta("Saldo");
        System.out.println();

        c2.impInfoCuenta();
        System.out.println();
        c3.impInfoCuenta();

    }
}
