package mx.unam.fi.poo.g1.p56.p2;
import java.util.Scanner;
import mx.unam.fi.poo.g1.p56.p2.*;
/**
 * Clase principal de la Practica 2
 * @version 1.0 2024-09-27
 * @author Fernando López, Grupo 1 POO
 */
public class Practica2 {
    /**
     * Metodo principal main <br>
     * Ejecuta todo el funcionamiento de la aplicacion
     * @param args argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\n== Bienvenido a la Practica 2 ==\nEsta aplicacion despliega el Triangulo de Pascal");
        System.out.print("Ingresa el numero de filas: ");
        TrianguloPascal triangulo = new TrianguloPascal(entrada.nextInt());
        entrada.close();

        triangulo.imprimirTriangulo();

        System.out.println("\n==Gracias por usar la aplicacion. Saliendo del programa...==\n");
    }
    
}
