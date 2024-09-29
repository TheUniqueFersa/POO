package mx.unam.fi.poo.g1.p56;

/**
 * Clase Libro
 * @author Grupo 1 POO
 * @version Septiembre-2024; 
 *
 */

public class Libro {
    private String titulo;
    private String autor;
    
    /**
     * Método constructor
     * Para construir objetos libro
     * @param titulo Atributo para el titulo del Libro
     * @param autor Atributo para el autor del libro
     */

    public Libro(String titulo, String autor){
        setTitulo(titulo);
        setAutor(autor);
    }

    /**
     * Método get
     * @return titulo: Regresa el atributo titulo.
     */
    public String getTitulo(){
        return titulo;
    }

    /**
     * Método set
     * @param titulo : Para cambiar el dato de titulo del libro
     */
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    /**
     * Método get
     * @return titulo : Regresa el atributo titulo.
     */
    public String getAutor(){
        return autor;
    }

    /**
     * Método set
     * @param autor Para cambiar el dato de titulo del libro
     */
    public void setAutor(String autor){
        this.autor = autor;
    }


}

