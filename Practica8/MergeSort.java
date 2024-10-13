package mx.unam.fi.poo.g1.p8.E1;
import mx.unam.fi.poo.g1.p8.E1.Utilerias;
import mx.unam.fi.poo.g1.p8.E1.Ordenamiento;
/**
 * Clase MergeSort que implementa la interfaz Ordenamiento
 * @version 1.0 11/10/2021
 * @author Fernando Lopez Morales Grupo 1 POO
 */
public class MergeSort implements Ordenamiento {
    /**
     * Metodo que ordena un arreglo de enteros por MergeSort
     * @param arr : Arreglo de enteros
     * @param izq : Indice izquierdo
     * @param der : Indice derecho
     */
    public void sort(int arr[], int izq, int der) {
        if (izq < der) {
            int med = (izq + der) / 2;

            sort(arr, izq, med);
            sort(arr, med + 1, der);

            merge(arr, izq, med, der);
        }
    }
    /**
     * Metodo que mezcla dos subarreglos de arr[]
     * @param arr : Arreglo de enteros
     * @param izq : Indice izquierdo
     * @param med : Indice medio
     * @param der : Indice derecho
     */
    private void merge(int arr[], int izq, int med, int der) {
        int n1 = med - izq + 1;
        int n2 = der - med;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[izq + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[med + 1 + j];

        int i = 0, j = 0;

        int k = izq;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
