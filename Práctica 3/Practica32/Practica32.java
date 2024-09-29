package mx.unam.fi.poo.g1.p56.p32;
import java.util.Scanner;

import mx.unam.fi.poo.g1.p56.p32.*;
/**
 * Clase principal de la Practica 3.2
 * @version 1.0 2024-09-27
 * @author Fernando López, Grupo 1 POO
 */
public class Practica32 {
    /**
     * Metodo principal main <br>
     * Ejecuta todo el funcionamiento de la aplicacion
     * @param args argumentos de la linea de comandos
     */
    public static void main(String[] args){
        System.out.println("== Bienvenido al Ejercicio 2 de la Practica 3 ==");

        ArrayListReemplazo arr = new ArrayListReemplazo();

        Scanner entrada = new Scanner(System.in);
        arr.llenarArreglo("Ingresa la cantidad de elementos (enteros) que deseas agregar al ArrayList: ");
        System.out.println("El arreglo original es : " + arr.getArr());
        System.out.print("\nIngresa el valor (entero) que quieres reemplazar en la segunda posicion: "); 
        int valor = entrada.nextInt();
        entrada.close();
        arr.reemplaza2Elemento(valor);
        System.out.println("\nEl arreglo modificado es: " + arr.getArr());
        System.out.println("\n== Gracias por usar la aplicacion. Saliendo del programa... ==\n");
    }
}