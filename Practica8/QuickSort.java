package mx.unam.fi.poo.g1.p8.E1;
import mx.unam.fi.poo.g1.p8.E1.Ordenamiento;
import mx.unam.fi.poo.g1.p8.E1.Utilerias;
/**
 * Clase QuickSort que implementa la interfaz Ordenamiento
 * @version 1.0 11/10/2021
 * @author Fernando Lopez Morales Grupo 1 POO
 */
public class QuickSort implements Ordenamiento{
    Utilerias util = new Utilerias();
    /**
     * Metodo que realiza la particion de un arreglo de enteros tomando el pivote 
     * como el ultimo elemento y ordena los elementos menores al pivote a la izquierda 
     * y los mayores a la derecha
     * @param arr : Arreglo de enteros
     * @param izq : Indice izquierdo
     * @param der : Indice derecho
     */
    private int partition(int arr[], int izq, int der){
        int pivot = arr[der];
        int i = (izq-1);
        for (int j=izq; j<der; j++){ 
            if (arr[j] <= pivot){
                i++;
                util.intercambiar(arr, i,j);
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[der];
        arr[der] = temp;
        return i+1;
    }
    /**
     * Metodo que ordena un arreglo de enteros por QuickSort haciendo constantes llamadas a partition
     * @param arr : Arreglo de enteros
     * @param izq : Indice izquierdo
     * @param der : Indice derecho
     */
    public void sort(int arr[], int izq, int der){
        if (izq < der){
            int pi = partition(arr, izq, der);
            sort(arr, izq, pi-1);
            sort(arr, pi+1, der);
        }
    }
}
