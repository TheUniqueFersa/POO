import java.util.Scanner;

public class Ejemplo0 {
    public static void main(String[] args) {
        int n1, n2;
        int suma = 0;
        int mayor, menor;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce un número entero:");
        n1 = entrada.nextInt();
        System.out.println("Introduce otro número entero:");
        n2 = entrada.nextInt();

        if (n1 > n2) {
            mayor = n1;
            menor = n2;
        } else {
            mayor = n2;
            menor = n1;
        }

        for (int i = menor; i <= mayor; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("La suma de los pares entre " + n1 + " y " + n2 + " es " + suma);
        entrada.close();
    }
}