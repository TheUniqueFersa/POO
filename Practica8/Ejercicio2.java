package mx.unam.fi.poo.g1.p8.E2;
import mx.unam.fi.poo.g1.p8.E2.*;
/**
 * Clase que hace las pruebas del Ejercicio 2 de la Practica 8
 * @version 1.0 11/10/2021
 * @author Fernando Lopez Morales
 */
public class Ejercicio2 {
    /**
     * Metodo principal que hace las pruebas del Ejercicio 2
     * @param args : Argumentos de la linea de comandos
     */
    public static void main(String[] args){
        Empleado gerente1 = new Gerente("Maria Macedo", 20000, 5000);

        String[] tecnoP1 = {"Java", "Python", "C++"};
        Empleado prog1 = new Programador("Daniel Gosling", 5000, tecnoP1, 0);
        String[] tecnoP2 = {"React", "Angular", "JavaScript"};
        Empleado prog2 = new Programador("Fernanda Lovelace", 6000, tecnoP2, 5);

        System.out.println("\nDetalles del Gerente 1: ");
        System.out.println(gerente1);

        System.out.println("\nDetalles del Programador 1: ");
        System.out.println(prog1);

        System.out.println("\nDetalles del Programador 2: ");
        System.out.println(prog2);

        System.out.println("-- Los programadores se pueden esforzar y hacer actividades para aumentar su salario");

        System.out.println("El programador 1 ha terminado 4 actividades");
        ((Programador)prog1).incActTerminadas(4);
        System.out.println(prog1);

        System.out.println("El programador 2 ha terminado 3 actividades");
        ((Programador)prog2).incActTerminadas(3);
        System.out.println(prog2);

        System.out.println("-- El gerente solo aumenta su bono");
        ((Gerente)gerente1).setBono(6000);
        System.out.println(gerente1);
    }
}
