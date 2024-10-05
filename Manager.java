package mx.unam.fi.poo.g1.p7;
import mx.unam.fi.poo.g1.p7.Empleado;
/**
 * Clase Manager que hereda de Empleado y contiene los metodos y atributos propios de un Manager
 * @version 1.0 04/10/2021
 * @author Fernando Lopez Morales Grupo 1 POO
 */
public class Manager extends Empleado{
    /**
     * Constructor de la clase
     * @param nombre : Nombre del Manager
     * @param salario : Salario del Manager
     * @param direccion : Direccion del Manager
     * @param puesto : Puesto del Manager
     */
    public Manager(String nombre, double salario, String direccion, String puesto){
        super(nombre, salario, direccion, puesto, "Manager");
    }
    @Override
    /**
     * Metodo que regresa el bono del Manager
     * @return bono: Bono del Manager
     */
    public double obtenerBono(){
        return getSalario() * 0.15; //ay mama
    }
    /**
     * Metodo que genera un reporte de desempenio del Manager de acuerdo al argumento del método. Imprime también el número de proyectos supervisados y finalizados
     * @param desempenio : Desempenio del Manager
     * @return reporte: Reporte de desempenio del Manager
     */
    @Override
    public String generarReporteDesempenio(String desempenio){
        return "Reporte de desempenio del " + getPuesto() + " " + getNombre() + ": " + desempenio +". \n(" + getProyectos() + " Trabajos supervisados y finalizados)";
    }
    @Override
    /**
     * Metodo que imprime la accion que realiza el Manager de acuerdo a si tiene trabajo asignado o no
     */
    public void manejoProyectos(){
        if(getTrabajoAsignado()){
            System.out.println("Supervisando " + getAccion());
        }else{
            System.out.println("Coordinando con otros departamentos");
        }
    }

    
}
