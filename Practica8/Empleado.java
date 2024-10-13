package mx.unam.fi.poo.g1.p8.E2;
/**
 * Clase abstracta que define a un empleado
 * @version 1.0 11/10/2021
 * @author Fernando Lopez Morales
 */
public abstract class Empleado {
    private String nombre, rol;
    private double salario;
    /**
     * Constructor de la clase Empleado
     * @param nombre : Nombre del empleado
     * @param rol : Rol del empleado
     * @param salario : Salario del empleado
     */
    public Empleado(String nombre, String rol, double salario){
        setNombre(nombre);
        setRol(rol);
        setSalario(salario);
    }
    /**
     * Metodo set que asigna el nombre del empleado
     * @param nombre : Nombre del empleado
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    /**
     * Metodo get que regresa el nombre del empleado
     * @return nombre : Nombre del empleado
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Metodo set que asigna el rol del empleado
     * @param rol : Rol del empleado
     */
    public void setRol(String rol){
        this.rol = rol;
    }
    /**
     * Metodo get que regresa el rol del empleado
     * @return rol : Rol del empleado
     */
    public String getRol(){
        return rol;
    }
    /**
     * Metodo set que asigna el salario del empleado
     * @param salario : Salario del empleado
     */
    public void setSalario(double salario){
        this.salario = salario;
    }
    /**
     * Metodo get que regresa el salario del empleado
     * @return salario : Salario del empleado
     */
    public double getSalario(){
        return salario;
    }
    @Override
    /**
     * Metodo que regresa una cadena con los datos del empleado
     * @return String : Cadena con los datos del empleado
     */
    public String toString(){
        return "+----\n" + "Nombre: " + getNombre() + "\nRol: " + getRol() + "\nSalario Final: " + calcularSalario() + "\n+----\n";
    }
    /**
     * Metodo abstracto que calcula el salario del empleado
     * @return double : Salario del empleado
     */
    public abstract double calcularSalario();
}
