package mx.unam.fi.poo.g1.p11.Practica11;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

/**
 * Clase que se encarga de leer y escribir archivos de texto.
 * @version 1.0 2024-11-04
 * @author Grupo 1 Fernando López
 */
public class GestorArchivos {

    /**
     * Lee un archivo de texto y regresa una lista con las líneas del archivo.
     * @param rutaArchivo la ruta del archivo a leer.
     * @return una lista con las líneas del archivo.
     */
    public List<String> leerArchivo(String rutaArchivo) {
        List<String> lineas = new ArrayList<>();

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(rutaArchivo));
            String linea;
            while ((linea = br.readLine()) != null) {
                lineas.add(linea);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + rutaArchivo);
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + rutaArchivo);
        }
        return lineas;
    }

    /**
     * Escribe un archivo de texto con el contenido de una lista.
     * @param rutaArchivo la ruta del archivo a escribir.
     * @param contenido la lista con las líneas a escribir en el archivo.
     */
    public void escribirArchivo(String rutaArchivo, List<String> contenido) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(rutaArchivo));
            for (String linea : contenido) {
                bw.write(linea);
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + rutaArchivo);
        }
    }
}
