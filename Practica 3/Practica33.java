import java.util.HashMap;
import java.util.Scanner;

public class Practica33 {
    public static void main(String[] args){
        HashMap<String, Integer> tercerSemestreCompu = new HashMap<>();
        Scanner entrada = new Scanner(System.in);
        tercerSemestreCompu.put("PROBABILIDAD", 1436);
        tercerSemestreCompu.put("CALCULO VECTORIAL", 1321);
        tercerSemestreCompu.put("ECUACIONES DIFERENCIALES", 1325);
        tercerSemestreCompu.put("CULTURA Y COMUNICACION", 1222);
        tercerSemestreCompu.put("EDA II", 1317);
        tercerSemestreCompu.put("POO", 1323);

        System.out.println("== Bienvenido al Ejercicio 3 de la Practica 3 ==");
        System.out.println("Este programa busca las claves de las asignaturas del tercer semestre de Ingenieria en Computacion, \nporque cuando un estudiante se inscribe, nunca recuerda sus claves :)\n");
        boolean continuar = false;
        do{
            System.out.println("Ingresa el nombre de la asignatura de tercer semestre de compu que deseas buscar: ");
            String asig = entrada.nextLine().toUpperCase();
            if(tercerSemestreCompu.containsKey(asig)){
                System.out.println("La clave de la asignatura " + asig + " es: " + tercerSemestreCompu.get(asig));
                continuar = true;
            } else{
                System.out.println("La asignatura " + asig + " no se encuentra en el tercer semestre de Ingenieria en Computacion");
            }
        }while(!continuar);
        entrada.close();
        System.out.println("\n== Gracias por usar la aplicacion. Saliendo del programa... ==\n");
    }
}