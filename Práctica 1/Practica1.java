package mx.unam.fi.poo.g1.p56.p1;
import java.util.Scanner;
import mx.unam.fi.poo.g1.p56.p1.CalculadoraDistancia;

/**
 * Clase principal de la Practica 1
 * @version 2.0 2024-09-27
 * @author Fernando López, Grupo 1 POO
 */
public class Practica1 {
    /**
     * Metodo principal main <br>
     * Ejecuta todo el funcionamiento de la aplicacion
     * @param args: argumentos de la linea de comandos
     */
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\n== Bienvenido a la Practica 1 ==\nEsta aplicacion calcula la distancia entre dos puntos de la tierra");        
        double datoEntrante;
        CalculadoraDistancia calculadora = new CalculadoraDistancia();

        System.out.print("Ingrese las coordenadas del punto 1:\nLatitud (x1): ");
        datoEntrante = entrada.nextDouble();
        calculadora.setX1(datoEntrante);

        System.out.print("\nLongitud (y1): ");
        datoEntrante = entrada.nextDouble();
        calculadora.setY1(datoEntrante);

        System.out.print("\nIngrese las coordenadas del punto 2:\nLatitud (x2): ");
        datoEntrante = entrada.nextDouble();
        calculadora.setX2(datoEntrante);

        System.out.print("\nLongitud (y2): ");
        datoEntrante = entrada.nextDouble();
        calculadora.setY2(datoEntrante);

        entrada.close();

        calculadora.calcularDistancia();
        
        System.out.printf("\nLa distancia entre \nel punto 1: (%f, %f)\ny el punto 2: (%f, %f)\n\nes : %.4f km\n", 
        calculadora.getX1(), calculadora.getY1(), calculadora.getX2(), calculadora.getY2(), calculadora.getDistancia());
        System.out.println("\n==Gracias por usar la aplicacion. Saliendo del programa...==\n");
    }
}