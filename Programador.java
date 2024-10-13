package mx.unam.fi.poo.g1.p8.E2;
import mx.unam.fi.poo.g1.p8.E2.Empleado;
/**
 * Clase que define a un programador
 * @version 1.0 11/10/2021
 * @author Fernando Lopez Morales
 */
public class Programador extends Empleado{
    private String[] tecnologias;
    private int actTerminadas;
    /**
     * Constructor de la clase Programador
     * @param nombre : Nombre del programador
     * @param sal : Salario del programador
     * @param tecnologias : Tecnologias que domina el programador
     */
    public Programador(String nombre, double sal, String[] tecnologias){
        super(nombre, "Gerente", sal);
        setTecnologias(tecnologias);
        setActTerminadas(0);
    }
    /**
     * Constructor sobrecargado de la clase Programador
     * @param nombre : Nombre del programador
     * @param sal : Salario del programador
     * @param tecnologias : Tecnologias que domina el programador
     * @param actTerminadas : Actividades terminadas por el programador
     */
    public Programador(String nombre, double sal, String[] tecnologias, int actTerminadas){
        super(nombre, "Gerente", sal);
        setTecnologias(tecnologias);
        setActTerminadas(actTerminadas);
    }
    /**
     * Metodo set que asigna el numero de actividades terminadas por el programador
     * @param actTerminadas : Actividades terminadas por el programador
     */
    public void setActTerminadas(int actTerminadas){
        this.actTerminadas = actTerminadas;
    }
    /**
     * Metodo get que regresa el numero de actividades terminadas por el programador
     * @return actTerminadas : Actividades terminadas por el programador
     */
    public int getActTerminadas(){
        return actTerminadas;
    }
    /**
     * Metodo que incrementa en 1 el numero de actividades terminadas por el programador
     */
    public void incActTerminadas(){
        setActTerminadas(getActTerminadas() + 1);
    }
    /**
     * Metodo que incrementa en n el numero de actividades terminadas por el programador
     * @param act : Numero de actividades a incrementar
     */
    public void incActTerminadas(int act){
        setActTerminadas(getActTerminadas() + act);
    }
    /**
     * Metodo set que asigna las tecnologias que domina el programador
     * @param tecnologias : Tecnologias que domina el programador
     */
    public void setTecnologias(String[] tecnologias){
        this.tecnologias = tecnologias;
    }
    /**
     * Metodo get que imprime las tecnologias que domina el programador
     */
    public void getTecnologias(){
        for(int i = 0; i < tecnologias.length; i++){
            System.out.println(tecnologias[i]);
        }
    }
    /**
     * Metodo que calcula el salario del programador, esto es: salario + bono
     * @return Salario del programador
     */
    public double calcularSalario(){
        return getSalario() + calcularBono();
    }
    @Override
    /**
     * Metodo que imprime una cadena con los datos del programador
     * @return String : Cadena con los datos del programador
     */
    public String toString(){
        System.out.println(super.toString() + "\nCon conocimientos en: ");
        getTecnologias();
        return "\nActividades terminadas: " + getActTerminadas();
    }        
    /**
     * Metodo que calcula el bono del programador, esto es: 0.1 * actividades terminadas * salario
     * @return Bono del programador
     */
    public double calcularBono(){
        return (actTerminadas * 0.1) * getSalario();
    }   
}
