package mx.unam.fi.poo.g1.p8.e0;
import mx.unam.fi.poo.g1.p8.e0.*;
public class Ejercicio0{
    public static void main(String [] args){
        int[] arr = {4, 2, 0, 3, 1, 6, 8};
        int[] arr2 = {4, 2, 0, 3, 1, 6, 8};
        System.err.println("Arreglo original");
        imprime(arr);
        Ordenamiento bubble = new BubbleSort();
        bubble.ordenar(arr);
        System.err.println("Arreglo ordenado");
        imprime(arr);
        
        System.err.println("Arreglo original");
        imprime(arr);
        Ordenamiento selection = new SelectionSort();
        selection.ordenar(arr2);
        System.err.println("Arreglo ordenado");
        imprime(arr);
    }
    public static void imprime(int [] arr){
        for(int i : arr){
            System.out.println(i + " ");
        }
        System.out.println();
    }
}