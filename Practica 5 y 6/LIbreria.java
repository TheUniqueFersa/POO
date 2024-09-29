package mx.unam.fi.poo.g1.p56;

import java.util.ArrayList;
import mx.unam.fi.poo.g1.p56.Libro;
/**
 * @author 
 * @version 2024
 */
public class Libreria{
    private ArrayList<Libro> libros;
    /**
     * Constructor
     */
    public Libreria(){
        libros = new ArrayList<>();
    }

    /**
     * Método para agragar libros
     * @param libro -> Objeto libro a agregar
     */
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    /**
     * Método para quitar libros
     * @param libro -> Objeto libro a quitar
     */
    public void quitarLibro(Libro libro){
        libros.remove(libro);
    }

    /**
     * Método para accesar a la librería
     * @return libros -> Regresa el ArrayList
     */
    public ArrayList<Libro> getLibros(){

    }
}