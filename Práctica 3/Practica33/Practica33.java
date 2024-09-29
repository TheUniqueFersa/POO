package mx.unam.fi.poo.g1.p56.p33;

import java.util.HashMap;
import java.util.Scanner;
/**
 * Clase principal de la Practica 3.3
 * @version 1.0 2024-09-27
 * @author Fernando López, Grupo 1 POO
 */
public class Practica33 {
    /**
     * Metodo principal main <br>
     * Ejecuta todo el funcionamiento de la aplicacion
     * @param args argumentos de la linea de comandos
     */
    public static void main(String[] args){
        HashMap<String, Integer> tercerSemestreCompu = new HashMap<>();
        Scanner entrada = new Scanner(System.in);
        tercerSemestreCompu.put("PROBABILIDAD", 1436);
        tercerSemestreCompu.put("CALCULO VECTORIAL", 1321);
        tercerSemestreCompu.put("ECUACIONES DIFERENCIALES", 1325);
        tercerSemestreCompu.put("CULTURA Y COMUNICACION", 1222);
        tercerSemestreCompu.put("EDA II", 1317);
        tercerSemestreCompu.put("POO", 1323);

        SemestreCompu terSemestre = new SemestreCompu(tercerSemestreCompu);

        System.out.println("== Bienvenido al Ejercicio 3 de la Practica 3 ==");

        System.out.println("Este programa busca las claves de las asignaturas del tercer semestre de Ingenieria en Computacion, \nporque cuando un estudiante se inscribe, nunca recuerda sus claves :)\n");
        boolean continuar = false;
        do{
            System.out.println("Ingresa el nombre de la asignatura de tercer semestre de compu que deseas buscar: ");
            String asig = entrada.nextLine().toUpperCase();
            continuar = terSemestre.buscarClave(asig);
        }while(!continuar);
        entrada.close();
        System.out.println("\n== Gracias por usar la aplicacion. Saliendo del programa... ==\n");
    }
}
