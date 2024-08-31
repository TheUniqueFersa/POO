import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String [] args){
        Scanner en = new Scanner(System.in);
        System.out.print("Ingresa el primer valor con decimal: ");
        double n1 = en.nextDouble();
        System.out.print("Ingresa el segundo valor con decimal: ");
        double n2 = en.nextDouble();
        en.close();

        if(Math.abs(n1 - n2) < 0.01){
            System.out.println("Los numeros son iguales");
        } else {
            System.out.println("Los numeros no son iguales");
        }
    }
}
