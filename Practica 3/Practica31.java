import java.util.Scanner;
public class Practica31 {
    static Scanner entrada = new Scanner(System.in);
    public static String leerCadena(String msg){
        System.out.println(msg);
        String retorno = entrada.nextLine();
        return retorno;
    }
    public static char leerChar(String msg){
        System.out.println(msg);
        char retorno = entrada.next().charAt(0);
        return retorno;
    }
    public static void main(String[] args){
        System.out.println("== Bienvenido al Ejercicio 1 de la Practica 3 ==");
        String cad = leerCadena("Ingresa una cadena: ");
        char anterior, nuevo;
        anterior = leerChar("Ingresa el caracter que quieras reemplazar: ");
        nuevo = leerChar("Ingresa el caracter por el que lo quieres reemplazar: ");
        entrada.close();
        System.out.println("La cadena original es: " + cad);
        System.out.println("La cadena con el reemplazo es: " + cad.replace(anterior, nuevo));
        System.out.println("\n== Gracias por usar la aplicacion. Saliendo del programa... ==\n");
    }
}