import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("INgresa el primer numero:");
        int n1 = entrada.nextInt();
        System.out.println("INgresa el segundo numero");
        int n2 = entrada.nextInt();

        entrada.close();

        int suma = n1 + n2;
        int resta = n1 - n2;
        int producto = n1 * n2;
        int cociente = n1 / n2;
        int residuo = n1 % n2;

        System.out.printf("Suma = %d\nResta = %d\nMultiplicacion = %d\nDivision = %d\nResiduo = %d\n", suma, resta, producto, cociente, residuo);

    }
}