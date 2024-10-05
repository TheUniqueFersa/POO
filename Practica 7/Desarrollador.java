package mx.unam.fi.poo.g1.p7;
import mx.unam.fi.poo.g1.p7.Empleado;
/**
 * Clase Desarrollador que hereda de Empleado y contiene los metodos y atributos propios de un Desarrollador
 * @version 1.0 04/10/2021
 * @author Fernando Lopez Morales Grupo 1 POO
 */
public class Desarrollador extends Empleado{
    /**
     * Constructor de la clase
     * @param nombre : Nombre del Desarrollador
     * @param salario : Salario del Desarrollador
     * @param direccion : Direccion del Desarrollador
     * @param puesto : Puesto del Desarrollador
     */
    public Desarrollador(String nombre, double salario, String direccion, String puesto){
        super(nombre, salario, direccion, puesto, "Desarrollador");
    }
    /**
     * Metodo que regresa el bono del Desarrollador
     * @return bono: Bono del Desarrollador
     */
    @Override
    public double obtenerBono(){
        return getSalario() * 0.10;
    }
    /**
     * Metodo que genera un reporte de desempenio del Desarrollador de acuerdo al argumento del método. Imprime también el número de implementaciones finalizadas
     * @param desempenio : Desempenio del Desarrollador
     * @return reporte: Reporte de desempenio del Desarrollador
     */
    @Override
    public String generarReporteDesempenio(String desempenio){
        return "Reporte de desempenio del " + getPuesto() + " " + getNombre() + ": " + desempenio +". \n(" + getProyectos() + " Implementaciones finalizadas)";
    }
    /**
     * Metodo que imprime la accion que realiza el Desarrollador de acuerdo a si tiene trabajo asignado o no
     */
    @Override
    public void manejoProyectos(){
        if(getTrabajoAsignado()){
            System.out.println("Diseniando " + getAccion());
        }else{
            System.out.println("Corrigiendo errores del sistema");
        }
    }
    
}
