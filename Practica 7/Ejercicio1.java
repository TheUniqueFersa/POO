class CuentaBanco{
    private String numeroCuenta;
    private double saldo;
    public CuentaBanco(String numeroCuenta, double saldo){
        setNumeroCuenta(numeroCuenta);
        setSaldo(saldo);
    }
    public void setNumeroCuenta(String numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    public String getNumeroCuenta(){
        return this.numeroCuenta;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void depositar(double cantidad){
        this.saldo += cantidad;
    }
    
    public void retirar(double cantidad){
        if(this.getSaldo() >=  cantidad){
            this.saldo -= cantidad;
        }else{
            System.out.println("FONdos insuficientes");
        }
    }
}
class CuentaAhorro extends CuentaBanco{
    public CuentaAhorro(String numeroCuenta, double saldo){
        super(numeroCuenta, saldo);
    }
    @Override
    public  void retirar(double cantidad){
        if(this.getSaldo() - cantidad <100){
            System.out.println("Se reqiuere un saldo de al menos 100");
        } else {
            super.retirar(cantidad);
        }
    }
}
public class Ejercicio1{
    public static void main(String[] args) {
        System.out.println("Se crea un objeto CuentaBanco (C/b No. CB1234) con un saldo inicial de $500");
        CuentaBanco CB1234 = new CuentaBanco("CB1234", 500);
        System.out.println("Se depositan $1000 a la cuenta CB1234");
        CB1234.depositar(1000.0);
        System.out.println("Saldo nuevo: " + CB1234.getSaldo());
        System.out.println("Se retiran $600 de la cuenta CB1234");
        CB1234.retirar(600.0);
        System.out.println("Saldo nuevo: " +CB1234.getSaldo());
        System.out.println("\n Creando un objeto CuentaAhorro (C/a No. CA1000) con un saldo inicial de $ 450");
        CuentaAhorro CA1000 = new CuentaAhorro("CA1000", 450);
        System.out.println("Se retiran $300 de la cuenta CA1000");
        CA1000.retirar(300);
        System.out.println("Saldo nuevo: "+CA1000.getSaldo());
        System.out.println("\n Creando un objeto CuentaAhorro (C/a No. CA1001) con un saldo inicial de $300");
        CuentaAhorro CA1001 = new CuentaAhorro("CA1001", 300);
        System.out.println("Se intenta retiro por $250...");
        CA1001.retirar(250);
        System.out.println("Saldo actual: " + CA1001.getSaldo());




    }
}