//package mx.unam.fi.poo.gestorarchivos;
package mx.unam.fi.poo.g1.p11.Practica11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que procesa archivos de texto.
 * @version 1.0 2024-11-04
 * @author Grupo 1 Fernando López
 */
public class Practica11 {
    private static final String[] archivosEntrada = {"./dat/Resumen.txt", "./data/Programa.txt", "./data/Conclusiones.txt"};
    private static final String archivoSalida = "./data/Reporte.txt";
    /**
     * Método principal que procesa los archivos de texto.
     * @param args los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        GestorArchivos gestorArchivos = new GestorArchivos();
        ProcesadorArchivos procesadorArchivos = new ProcesadorArchivos(gestorArchivos);

        List<String> contenidoCombinado = procesadorArchivos.procesarArchivos(archivosEntrada);
        gestorArchivos.escribirArchivo(archivoSalida, contenidoCombinado);
        
        System.out.println("El contenido de los archivos ha sido combinado en: " + archivoSalida);
    }
}
