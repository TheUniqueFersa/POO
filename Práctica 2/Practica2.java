import java.util.Scanner;

public class Practica2 {
    public static void trianguloPascal(int filas){
        //Note que i es cada fila
        for (int i = 0; i <filas; i++) {
            // For que imprime los espacios en blanco para el correcto desplazamiento de cada numero
            for (int j =0; j < filas - i - 1; j++) {
                System.out.print(" ");
            }
            int coeficienteBinomial = 1;
            //Note que j es cada "columna"
            for (int j=0; j<=i; j++) {
                System.out.print(coeficienteBinomial + " ");
                coeficienteBinomial = coeficienteBinomial * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\n== Bienvenido a la Practica 2 ==\nEsta aplicacion despliega el Triangulo de Pascal");
        System.out.print("Ingresa el numero de filas: ");
        int filas = entrada.nextInt();
        entrada.close();
        trianguloPascal(filas);

        System.out.println("\n==Gracias por usar la aplicacion. Saliendo del programa...==\n");
    }
}
