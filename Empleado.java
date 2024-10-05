package mx.unam.fi.poo.g1.p7;

/**
 * Clase base Empleado que contiene los atributos y metodos comunes a todos los empleados
 * @version 1.0 04/10/2021
 * @author Fernando Lopez Morales Grupo 1 POO
 */
public class Empleado {
    private String nombre;
    private double salario;
    private String direccion;
    private String nombreTrabajo; //nombre de Trabajo
    private String puesto;
    private String accion;
    private boolean trabajoAsignado = false;
    private int proyectos = 0;

    /**
     * Constructor de la clase
     * @param nombre : Nombre del empleado
     * @param salario : Salario del empleado
     * @param direccion : Direccion del empleado
     * @param nombreTrabajo : Nombre del trabajo
     * @param puesto : Puesto del empleado
     */
    public Empleado(String nombre, double salario, String direccion, String nombreTrabajo, String puesto){
        setNombre(nombre);
        setSalario(salario);
        setDireccion(direccion);
        setNombreTrabajo(nombreTrabajo);
        setPuesto(puesto);
    }
    /**
     * Metodo set
     * @param nombre Para establecer el nombre del empleado
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    /**
     * Metodo get
     * @return nombre: Nombre del empleado
     */
    public String getNombre(){
        return this.nombre;
    }
    /**
     * Metodo set
     * @param salario Para establecer el salario del empleado
     */
    public void setSalario(double salario){
        this.salario = salario;
    }
    /**
     * Metodo get
     * @return salario: Salario del empleado
     */
    public double getSalario(){
        return this.salario;
    }
    /**
     * Metodo set
     * @param direccion Para establecer la direccion del empleado
     */
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    /**
     * Metodo get
     * @return direccion: Direccion del empleado
     */
    public String getDireccion(){
        return this.direccion;
    }
    /**
     * Metodo set
     * @param puesto Para establecer el puesto del empleado
     */
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }
    /**
     * Metodo get
     * @return puesto: Puesto del empleado
     */
    public String getPuesto(){
        return this.puesto;
    }
    /**
     * Metodo set
     * @param nombreTrabajo Para establecer el nombre del Trabajo del Empleado
     */
    public void setNombreTrabajo(String nombreTrabajo){
        this.nombreTrabajo = nombreTrabajo;
    }
    /**
     * Metodo get
     * @return nombreTrabajo: Nombre del trabajo
     */
    public String getNombreTrabajo(){
        return this.nombreTrabajo;
    }
    /**
     * Metodo para obtener el bono del empleado
     * @return Bono: Bono del empleado
     */
    public double obtenerBono(){ //Pa sobreescribir
        return getSalario();
    }

    /**
     * Metodo set
     * @param proyectos Para establecer el numero de proyectos
     */
    public void setProyectos(int proyectos){
        this.proyectos = proyectos;
    }
    /**
     * Metodo get
     * @return proyectos: Numero de proyectos
     */
    public int getProyectos(){
        return this.proyectos;
    }
    /**
     * Metodo para incrementar el numero de proyectos
     * @param proyectos : Numero de proyectos a incrementar
     */
    public void incremEnNProyectos(int proyectos){
        setProyectos(getProyectos() + proyectos);
    }

    /**
     * Metodo para generar un reporte de desempenio
     * @param desempenio : Desempenio que se le quiera dar al empleado
     * @return Reporte de desempenio
     */
    public String generarReporteDesempenio(String desempenio){
        return "Reporte de desempenio : " + desempenio +". \n(" + getProyectos() + " Trabajos finalizados)";
    }
    
    /**
     * Metodo set
     * @param accion Para establecer la accion a realizar
     */
    public void setAccion(String accion){
        this.accion = accion;
    }
    /**
     * Metodo get
     * @return accion: Accion a realizar
     */
    public String getAccion(){
        return this.accion;
    }
    
    /**
     * Metodo set
     * @param trabajoAsignado Para establecer si se ha asignado trabajo
     */
    public void setTrabajoAsignado(boolean trabajoAsignado){
        this.trabajoAsignado = trabajoAsignado;
    }
    /**
     * Metodo get
     * @return trabajoAsignado: Valor booleano si se ha asignado trabajo
     */
    public boolean getTrabajoAsignado(){
        return this.trabajoAsignado;
    }
    /**
     * Metodo para manejar proyectos, imprime si se esta trabajando en un proyecto (y cual) o no
     */
    public void manejoProyectos(){
        if(getTrabajoAsignado()){
            System.out.println("Trabajando en " + getAccion());
        }else{
            System.out.println("No se ha asignado trabajo");//Para sobreescribir
        }
    }
    /**
     * Metodo para asignar trabajo
     * @param accion : Accion a realizar
     */
    public void manejoProyectos(String accion){
        setAccion(accion);
        setTrabajoAsignado(true);
        manejoProyectos();
    }
    /**
     * Metodo para terminar el trabajo asignado y resetear los valores
     */
    public void terminarTrabajo(){
        if(getTrabajoAsignado()){
            System.out.println("Terminando trabajo en " + getAccion());
            setTrabajoAsignado(false);
            setAccion("");
            incremEnNProyectos(1);
        } else {
            System.out.println("No se ha asignado trabajo especifico aun");
        }
    }

}
