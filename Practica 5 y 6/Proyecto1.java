import java.util.ArrayList;
class Libro{
    String titulo, autor;
    public Libro(String nombre, String autor){
        titulo = nombre;
        this.autor = autor;
    }
}
class Libreria{
    ArrayList<Libro> libros = new ArrayList<>();
    String nombre;
    // Crear libreria con ya una lista de libros
    public Libreria(String nombre, ArrayList<Libro> libs){
        this.nombre = nombre;
        libros = libs;
    }
    // Para crear libreria con un solo libro
    public Libreria(String nombre, Libro l){
        this.nombre = nombre;
        libros.add(l);
    }
    // Crear libreria sin libros
    public Libreria(String nombre){
        this.nombre = nombre;
    }

    // Agregar libro como objeto
    public void agregarLibro(Libro l){
        libros.add(l);
    }
    // Agregar libro como sus atributos
    public void agregarLibro(String nombre, String autor){
        Libro lib = new Libro(nombre, autor);
        libros.add(lib);
    }

    // QUitar ultimo libro insertado
    public void quitarLibro(){
        if(libros.size()>0)
            libros.remove(libros.size()-1);
        else
            System.out.println("La libreria " + nombre + " no tiene libros");
    }

    // Quitar libro en el indice indicado
    public void quitarLibro(int index){
        if(libros.size() > 0 ){
            if(index <= libros.size() && index > 0){
                libros.remove(index-1);
            } else {
                System.out.println("El indice del libro solicitado (" + index + ") no existe");
            }
        } else {
            System.out.println("La libreria " + nombre + " aun no tiene libros");
        }
    }


    public void imprimirLibros(){
        int i=1;
        for(Libro cadaLibro : libros){
            System.out.printf("Libro %d: %s - Autor: %s\n", i, cadaLibro.titulo, cadaLibro.autor);
            i++;
        }
        System.out.printf("--- La libreria %s tiene %d %s ---\n", nombre, libros.size(), (libros.size() == 1)? "libro" : "libros");
    }
}
public class Proyecto1{
    public static void main(String[] args){
        System.out.println("==== PORRUA ====");
        Libreria Porrua = new Libreria("Porrua");
        Porrua.quitarLibro();
        Porrua.imprimirLibros();
        System.out.println("");

        Libro lib1 = new Libro("Como programar en Java", "Deitel");
        Libro lib2 = new Libro("Como programar en C", "Deitel");
        Libro lib3 = new Libro("Algorithms 3", "MIT Press");
        Libro lib4 = new Libro("Guia de Ligue", "Youtuber");
        Libro lib5 = new Libro("Biblia", "Varios");
        ArrayList<Libro> miLista = new ArrayList<>();
        miLista.add(lib1);
        miLista.add(lib2);
        miLista.add(lib3);
        miLista.add(lib4);
        miLista.add(lib5);
        

        System.out.println("==== NUEVA PORRUA ====");
        Porrua = new Libreria("Nueva Porrua", lib4);
        Porrua.imprimirLibros();
        System.out.println("");

        Porrua.agregarLibro(lib2);
        Porrua.agregarLibro(lib3);

        System.out.println("Despues de insercion: ");
        Porrua.imprimirLibros();
        System.out.println("");

        Porrua.quitarLibro(); //SOlo quita el ultimo
        Porrua.quitarLibro(); //SOlo quita el ultimo
        Porrua.imprimirLibros();
        System.out.println("");

        Porrua.quitarLibro(9); //Da error
        Porrua.quitarLibro(1); 
        Porrua.imprimirLibros();
        System.out.println("");
        

        System.out.println("==== BABEL ====");
        Libreria Babel = new Libreria("Babel", miLista);
        Babel.imprimirLibros();
        System.out.println("");

        Babel.agregarLibro("La Fundacion", "Isaac Asimov");
        Babel.imprimirLibros();
        System.out.println("");

        Babel.quitarLibro(1000); //Da error
        Babel.quitarLibro(-1); //Da error
        Babel.quitarLibro(4);

        Babel.imprimirLibros();
        System.out.println("");

    }
}