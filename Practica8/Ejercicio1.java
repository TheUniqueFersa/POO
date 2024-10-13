package mx.unam.fi.poo.g1.p8.E1;
import mx.unam.fi.poo.g1.p8.E1.*;
/**
 * Clase que implementa el ejercicio 1 de la practica 8
 * @version 1.0 11/10/2021
 * @author Fernando Lopez Morales Grupo 1 POO
 */
public class Ejercicio1 {
    /**
     * Metodo main que crea dos arreglos de enteros aleatorios y los ordena con QuickSort y MergeSort
     * @param args : Argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        int[] arr2 = new int[n];
        Ordenamiento quick = new QuickSort();
        Ordenamiento merge = new MergeSort();
        Utilerias util = new Utilerias();
        
        util.randomArr(arr);
        util.randomArr(arr2);

        System.out.println("Arreglo original:");
        util.imprimirArreglo(arr);
        quick.sort(arr, 0, arr.length - 1);
        System.out.println("Arreglo ordenado por QuickSort:");
        util.imprimirArreglo(arr);

        System.out.println("Arreglo original:");
        util.imprimirArreglo(arr2);
        merge.sort(arr2, 0, arr2.length - 1);
        System.out.println("Arreglo ordenado por MergeSort:");
        util.imprimirArreglo(arr2);
    }
}
