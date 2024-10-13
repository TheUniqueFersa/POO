package mx.unam.fi.poo.g1.p8.E2;
import mx.unam.fi.poo.g1.p8.E2.Empleado;
/**
 * Clase que define a un gerente
 * @version 1.0 11/10/2021
 * @author Fernando Lopez Morales
 */
public class Gerente extends Empleado{
    private double bono;
    /**
     * Constructor de la clase Gerente
     * @param nombre : Nombre del gerente
     * @param sal : Salario del gerente
     * @param bono : Bono del gerente
     */
    public Gerente(String nombre, double sal, double bono){
        super(nombre, "Gerente", sal);
        setBono(bono);
    }
    /**
     * Metodo set que asigna el bono del gerente
     * @param bono : Bono del gerente
     */
    public void setBono(double bono){
        this.bono = bono;
    }
    /**
     * Metodo get que regresa el bono del gerente
     * @return bono : Bono del gerente
     */
    public double getBono(){
        return bono;
    }
    /**
     * Metodo que calcula el salario del gerente, esto es: salario + bono
     * @return Salario del gerente
     */
    public double calcularSalario(){
        return getSalario() + getBono();
    }
    
}
