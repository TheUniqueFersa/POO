package mx.unam.fi.poo.g1.p56.p31;

import java.util.Scanner;
import mx.unam.fi.poo.g1.p56.p31.*;

/**
 * Clase principal de la practica 3.1
 * @version 1.0 2024-09-27
 * @author Fernando López, Grupo 1 POO
 */
public class Practica31 {
    /**
     * Metodo principal que ejecuta el programa
     * @param args Argumentos de la linea de comandos
     */
    public static void main(String[] args){
        System.out.println("== Bienvenido al Ejercicio 1 de la Practica 3 ==");

        Entradas entrada = new Entradas();
        CadReemplazo cad = new CadReemplazo(entrada.leerCadena("Ingresa una cadena: "), entrada.leerChar("Ingresa el caracter que quieras reemplazar: "), entrada.leerChar("Ingresa el caracter por el que lo quieres reemplazar: "));

        entrada.entrada.close();

        System.out.println("La cadena original es: " + cad.getCad());
        System.out.println("La cadena con el reemplazo es: " + cad.reemplazar());
        System.out.println("\n== Gracias por usar la aplicacion. Saliendo del programa... ==\n");
    }
}
