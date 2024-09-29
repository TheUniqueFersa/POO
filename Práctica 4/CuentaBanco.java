package mx.unam.fi.poo.g1.p56.p4;

import java.util.ArrayList;
/**
 * Clase que simula una cuenta de banco
 * @version 1.0 2024-09-27
 * @author Fernando López, Grupo 1 POO
 */
public class CuentaBanco{
    private String nombre, cuenta;
    private double saldo;
    final private int longnumCuenta = 12;
    private ArrayList<Double> movimientos; //Donde depositos[0] sería el depositoInicial
    /**
     * Constructor de la clase
     * @param nombre : Nombre del titular de la cuenta
     * @param cuenta : Numero de cuenta
     * @param depositoInicial : Cantidad con la que se abre la cuenta
     */
    public CuentaBanco(String nombre, String cuenta, double depositoInicial){
        setMovimientos(new ArrayList<>());
        setNombre(nombre);
        if(cuenta.length() > longnumCuenta){
            System.out.println("El numero de cuenta debe tener 12 digitos, por lo que se tomaran los primeros a 12 digitos");            
            setCuenta(cuenta.substring(0, longnumCuenta));
        } else {
            setCuenta(cuenta);
        }
        if(depositoInicial < 0){
            System.out.println("No se puede depositar una cantidad negativa, la cuenta se creara con saldo 0");
            setSaldo(0);
        } else{
            setSaldo(depositoInicial);
            registrarMovimiento(depositoInicial);
        }
    }
    /**
     * Metodo set
     * @param movimientos Para cambiar la lista de movimientos
     */
    private void setMovimientos(ArrayList<Double> movimientos) {
        this.movimientos = movimientos;
    }
    /**
     * Metodo set
     * @param nombre Para cambiar el nombre del titular de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Metodo get
     * @return nombre: Nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Metodo set
     * @param cuenta Para cambiar el numero de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }
    /**
     * Metodo get
     * @return cuenta: Numero de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }
    /**
     * Metodo set
     * @param saldo Para cambiar el saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Metodo get
     * @return saldo: Saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }
    /**
     * Metodo get
     * @return movimientos: Lista de movimientos de la cuenta
     */
    public ArrayList<Double> getMovimientos() {
        return movimientos;
    }
    /**
     * Metodo para depositar una cantidad en la cuenta. <br> Los movimientos se guardan en valor positivo
     * @param cantidad Cantidad a depositar. Requiere que sea mayor a 0
     */
    public void depositar(double cantidad){
        if(cantidad < 0){
            System.out.println("No se puede depositar una cantidad negativa");
        } else {
            saldo += cantidad;
            registrarMovimiento(cantidad);
        }
    }
    /**
     * Metodo para registrar un movimiento en la cuenta
     * @param movimiento Movimiento a registrar
     */
    public void registrarMovimiento(Double movimiento){
        getMovimientos().add(movimiento);
    }
    /**
     * Metodo para retirar una cantidad de la cuenta
     * @param cantidad Cantidad a retirar. Requiere que sea mayor a 0. <br> Los movimientos se guardan en valor negativo
     */
    public void retirar(double cantidad){
        if(cantidad < 0){
            System.out.println("No se puede retirar una cantidad negativa");
        } else{
            if(cantidad > saldo){
                System.out.println("No se puede retirar la cantidad solicitada");
            } else {
                this.saldo -= cantidad;
                movimientos.add(cantidad*(-1));
            }
        }        
    }
    /**
     * Metodo para imprimir la información de la cuenta
     * @param caso En String: Nombre, Cuenta, Saldo, Movimientos
     */
    public void impInfoCuenta(String caso){
        switch (caso) {
            case "Nombre":
                System.out.println("Nombre: " + getNombre());                
                break;
            case "Cuenta":
                System.out.println("Numero de cuenta: " + getCuenta());
                break;
            case "Saldo":
                System.out.println("Saldo: " + getSaldo());
                break;
            case "Movimientos":
                System.out.println("Movimientos:");
                impMovimientos();
                break;
            default:
                break;
        }
    }
    /**
     * Metodo para imprimir los movimientos de la cuenta (depositos y retiros) mientras que haya movimientos
     */
    public void impMovimientos(){
        if(getMovimientos().size() == 0){
            System.out.println("No hay movimientos registrados");
        } else {
            int i=1;
            for(Double dep : getMovimientos()){
                System.out.println(i++ + ": " + dep);
            }
        }
        
    }
    /**
     * Metodo para imprimir la información de la cuenta en formato de tabla
     */
    public void impInfoCuenta(){
        String formato = "| %-15s | %-12s | %.2f |\n";
        System.out.printf("+-----------------+--------------+------------+\n");
        System.out.printf("| Nombre          | Num. Cuenta  | Saldo      |\n");
        System.out.printf("+-----------------+--------------+------------+\n");
        System.out.printf(formato, getNombre(), getCuenta(), getSaldo());
        System.out.printf("+-----------------+--------------+------------+\n");
        System.out.printf("| %-15s |\n", "Movimientos");
        impMovimientos();
        System.out.printf("+-----------------+\n");
        
    }
}
