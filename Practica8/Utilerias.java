package mx.unam.fi.poo.g1.p8.E1;
import java.util.Random;

/**
 * Clase Utilerias que contiene metodos para generar arreglos aleatorios e imprimir arreglos
 * @version 1.0 11/10/2021
 * @author Fernando Lopez Morales Grupo 1 POO
 */
public class Utilerias {
    /**
     * Metodo que genera un arreglo de enteros aleatorios
     * @param arreglo : Arreglo de enteros
     */
    public void randomArr(int[] arreglo){
        Random random = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] =  random.nextInt(1000)+1;
        }
    }
    /**
     * Metodo que imprime un arreglo de enteros
     * @param arreglo : Arreglo de enteros
     */
    public void imprimirArreglo(int[] arreglo){
        for(int i:arreglo){  
            System.out.print(i+" ");  
        }
        System.out.println(" ");
    }
    /**
     * Metodo que intercambia dos elementos de un arreglo
     * @param arr : Arreglo de enteros
     * @param x : Indice x
     * @param y : Indice y
     */
    public void intercambiar(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
