package mx.unam.fi.poo.g1.p56.p31;

import java.util.Scanner;
/**
 * Clase que se encarga de leer datos de entrada
 * @version 1.0 2024-09-27
 * @author Fernando López, Grupo 1 POO
 */
public class Entradas {
    Scanner entrada = new Scanner(System.in);
    /**
     * Metodo que lee una cadena
     * @param msg Mensaje que se muestra al usuario
     * @return retorno: cadena leida
     */
    public String leerCadena(String msg){
        System.out.println(msg);
        String retorno = entrada.nextLine();
        return retorno;
    }
    /**
     * Metodo que lee un caracter
     * @param msg Mensaje que se muestra al usuario
     * @return retorno: caracter leido
     */
    public char leerChar(String msg){
        System.out.println(msg);
        char retorno = entrada.next().charAt(0);
        return retorno;
    }
}
