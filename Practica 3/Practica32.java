import java.util.ArrayList;
import java.util.Scanner;
public class Practica32 {
    static void reemplaza2Elemento(ArrayList<Integer> arr, int valor){
        if (arr.size() >= 2) {
            arr.set(1, valor);

            //arr.remove(1);
            //arr.add(1, valor);
        } else {
            System.out.println("El ArrayList no tiene al menos 2 elementos");
        }
    }
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("== Bienvenido al Ejercicio 2 de la Practica 3 ==");

        System.out.println("Ingresa la cantidad de elementos (enteros) que deseas agregar al ArrayList: ");
        int cantidad = entrada.nextInt();
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingresa el elemento " + (i + 1) + ": ");
            int elemento = entrada.nextInt();
            arr.add(elemento);
        }
        System.out.println("El arreglo original es : " + arr);
        System.out.print("\nIngresa el valor (entero) que quieres reemplazar en la segunda posicion: "); 
        int valor = entrada.nextInt();
        entrada.close();
        reemplaza2Elemento(arr, valor);
        System.out.println("\nEl arreglo modificado es: " + arr);
        System.out.println("\n== Gracias por usar la aplicacion. Saliendo del programa... ==\n");
    }
}