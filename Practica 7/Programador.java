package mx.unam.fi.poo.g1.p7;
import mx.unam.fi.poo.g1.p7.Empleado;

/**
 * Clase Programador que hereda de Empleado y contiene los metodos y atributos propios de un Programador
 * @version 1.0 04/10/2021
 * @author Fernando Lopez Morales Grupo 1 POO
 */
public class Programador extends Empleado{
    /**
     * Constructor de la clase
     * @param nombre : Nombre del Programador
     * @param salario : Salario del Programador
     * @param direccion : Direccion del Programador
     * @param puesto : Puesto del Programador
     */
    public Programador(String nombre, double salario, String direccion, String puesto){
        super(nombre, salario, direccion, puesto, "Programador");
    }
    @Override
    /**
     * Metodo que regresa el bono del Programador
     * @return bono: Bono del Programador
     */
    public double obtenerBono(){
        return getSalario() * 0.05;
    }
    @Override
    /**
     * Metodo que genera un reporte de desempenio del Programador de acuerdo al argumento del método. Imprime también el número de programas finalizados
     * @param desempenio : Desempenio del Programador
     * @return reporte: Reporte de desempenio del Programador
     */
    public String generarReporteDesempenio(String desempenio){
        return "Reporte de desempenio del " + getPuesto() + " " + getNombre() + ": " + desempenio +". \n(" + getProyectos() + " Programas finalizados)";
    }
    @Override
    /**
     * Metodo que imprime la accion que realiza el Programador de acuerdo a si tiene trabajo asignado o no
     */
    public void manejoProyectos(){
        if(getTrabajoAsignado()){
            System.out.println("Programando " + getAccion());
        }else{
            System.out.println("Capacitandose en nuevas tecnologias");
        }
    }
    
}
