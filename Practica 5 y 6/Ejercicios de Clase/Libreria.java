package mx.unam.fi.poo.g1.p56;

import java.util.ArrayList;
import mx.unam.fi.poo.g1.p56.Libro;

/**
 * Clase Libreria
 * @author Grupo 1 de POO
 * @version Septiembre-2024
 * 
 */

public class Libreria {
    private ArrayList<Libro> libros;

    /**
     * Método construcor
     */
    public Libreria(){
        libros = new ArrayList<Libro>();
    }

    /**
     * Método para agregar libros
     * @param libro  Objeto libro a agregar 
     */
    public void agregarLibro(Libro libro){
        libros.add(libro);
    }

    /**
     * Método para quitar libros
     * @param libro Objeto libro a quitar
     */
    public void quitarLibro(Libro libro){
        libros.remove(libro);
    }

    /**
     * Métood para accesar a la libreria
     *  @return libros : Regresa el ArrayList
     */
    public ArrayList<Libro> getLibros(){
        return libros;
    }
}