import java.util.Scanner;

public class Ejercicio0{
    public static void main(String [] args){
        int i, j, n;
        System.out.print("Ingresa el número para n: ");
        Scanner en = new Scanner(System.in);
        n = en.nextInt();

        for(i = 1; i <= n; i++){
            for(j = 1; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}