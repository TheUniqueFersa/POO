package mx.unam.fi.poo.g1.p56;
import mx.unam.fi.poo.g1.p56.*;

/**
 * CLase principal del proyecto 1
 * @author Grupo 1 de POO
 * @version Septiembre - 2024
 */
public class Proyecto1 {
    /**
     * Método main
     * Se ejecta todo el funcionamiento de la aplicacion
     * @param args -> Arreglo por defecto del método main
     */
    public static void main(String [] args){
        Libreria libreria = new Libreria();

        Libro libro1 = new Libro("Un mundo feliz", "Aldous Hux");
        Libro libro1 = new Libro("La historia interminable", "Aldous Hux");
        Libro libro1 = new Libro("Las cronicas del barrio", "Aldous Hux");
        Libro libro1 = new Libro("Un mundo feliz", "Aldous Hux");

        System.out.println("Libros disponibles en la libreria: ");

        libreria.quitarLibro(libro2);

        System.out.println("Libros disponibles en la libreria: ");

    }
}