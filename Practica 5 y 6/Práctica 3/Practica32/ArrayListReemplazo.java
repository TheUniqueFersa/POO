package mx.unam.fi.poo.g1.p56.p32;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Clase que reemplaza el segundo elemento de un ArrayList
 * @version 1.0 2024-09-27
 * @author Fernando López, Grupo 1 POO
 */
public class ArrayListReemplazo {
    Scanner entrada = new Scanner(System.in);
    private ArrayList<Integer> arr;
    /**
     * Constructor de la clase. Inicializa el ArrayList
     */
    public ArrayListReemplazo(){
        setArr(new ArrayList<>());
    }
    /**
     * Constructor de la clase
     * @param arr ArrayList de enteros
     */
    public ArrayListReemplazo(ArrayList<Integer> arr){
        setArr(arr);
    }
    /**
     * Metodo set
     * @param arr Para cambiar el ArrayList
     */
    public void setArr(ArrayList<Integer> arr){
        this.arr = arr;
    }
    /**
     * Metodo get
     * @return arr: ArrayList
     */
    public ArrayList<Integer> getArr(){
        return arr;
    }
    /**
     * Metodo que llena el ArrayList con los elementos que ingresa el usuario
     * @param msj Mensaje que se muestra al usuario
     */
    public void llenarArreglo(String msj){
        System.out.println(msj);
        int cantidad = entrada.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingresa el elemento " + (i + 1) + ": ");
            int elemento = entrada.nextInt();
            getArr().add(elemento);
        }
    }
    /**
     * Metodo que reemplaza el segundo elemento del ArrayList
     * @param valor Valor que se va a reemplazar
     */
    public void reemplaza2Elemento(int valor){
        if(getArr().size() >= 2){
            getArr().set(1, valor);
        } else {
            System.out.println("El arreglo no tiene suficientes elementos para hacer el reemplazo");
        }
    }


}
