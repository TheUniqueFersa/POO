import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        int x = entrada.nextInt();
        entrada.close();
        for(int i = 0; i<10; i++){
            System.out.println(x + " x " + (i+1) + " = " + (x*(i+1)));
        }

    }
}