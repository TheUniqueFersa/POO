package mx.unam.fi.poo.g1.p8.E1;

/**
 * Interfaz base Ordenamiento que contiene el metodo sort
 * @version 1.0 11/10/2021
 * @author Fernando Lopez Morales Grupo 1 POO
 */
public interface Ordenamiento {
    /**
     * Metodo sort que ordena un arreglo de enteros
     * @param arr : Arreglo de enteros
     * @param izq : Indice izquierdo
     * @param der : Indice derecho
     */
    public void sort(int arr[], int izq, int der);
}