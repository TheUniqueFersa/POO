package mx.unam.fi.poo.g1.p11.Practica11;
import java.util.ArrayList;
import java.util.List;
import mx.unam.fi.poo.g1.p11.Practica11.GestorArchivos;

/**
 * Clase que procesa archivos de texto.
 * @version 1.0 2024-11-04
 * @author Grupo 1 Fernando López
 */
public class ProcesadorArchivos {

    private GestorArchivos gestorArchivos;
    /**
     * Constructor que inicializa el gestor de archivos.
     * @param gestorArchivos el gestor de archivos a utilizar.
     */
    public ProcesadorArchivos(GestorArchivos gestorArchivos) {
        setGestorArchivos(gestorArchivos);
    }

    /**
     * Procesa una lista de archivos de texto y regresa una lista con el contenido combinado de los archivos.
     * @param rutasArchivos un arreglo con las rutas de los archivos a procesar.
     * @return una lista con el contenido combinado de los archivos.
     */
    public List<String> procesarArchivos(String[] rutasArchivos) {
        List<String> contenidoCombinado = new ArrayList<>();
        for (String rutaArchivo : rutasArchivos) {
            for (String linea : getGestorArchivos().leerArchivo(rutaArchivo)) {
                contenidoCombinado.add(linea);
            }
        }
        return contenidoCombinado;
    }
    /**
     * Establece el gestor de archivos.
     * @param gestorArchivos el gestor de archivos a utilizar.
     */
    public void setGestorArchivos(GestorArchivos gestorArchivos) {
        this.gestorArchivos = gestorArchivos;
    }
    /**
     * Regresa el gestor de archivos.
     * @return el gestor de archivos.
     */
    public GestorArchivos getGestorArchivos() {
        return gestorArchivos;
    }
}