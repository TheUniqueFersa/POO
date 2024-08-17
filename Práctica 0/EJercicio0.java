//
import java.util.Scanner;


public class Ejercicio0{
    public static void main(String[] args){
        //System.out.println("Hola\nEntes malignos:");
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el nombre: ");
        String nombre = entrada.next();

        System.out.print("Ingresa el apellido: ");
        String apellido = entrada.next();

        entrada.close();
        System.out.println();
        System.out.println("Hola\n" + nombre + " " + apellido);


        
    }
}