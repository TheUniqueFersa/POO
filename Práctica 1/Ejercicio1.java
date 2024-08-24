import java.util.Scanner;
public class Ejercicio1{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        boolean bandera = false;

        System.out.print("Ingresa un numero: ");
        int n = entrada.nextInt();
        entrada.close();
        if(n%2==0){
            bandera = true;
            System.out.println(bandera);
        } else {
            System.out.println(bandera);
        }
    }
}