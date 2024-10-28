package mx.unam.fi.poo.g1.p910.Practica;
/**
 * Clase que define una excepción personalizada para el caso de que una cadena contenga al menos una vocal.
 * @version 1.0 26/10/2024
 * @author Fernando Lopez Morales Grupo 1 POO
 */
public class StringContieneVocalException extends Exception{
    /**
     * Constructor que recibe un mensaje de error
     * @param mensaje Mensaje de error
     */
    public StringContieneVocalException(String mensaje){
        super(mensaje);
    }
}
