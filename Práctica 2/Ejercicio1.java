import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String [] args){
        int i, j, r;
        Scanner n = new Scanner(System.in);
        System.out.print("Ingresa el numero de filas (mitad del diamante)");
        r = n.nextInt();
        //Piramide superior:
        for(i=0; i<=r; i++){
            for(j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            for(j=1; j<=2*i-1; j++){
                System.out.print("*");
            }System.out.println();
        }
        //Piramide inferior
        for(i=r-1; i>=1; i--){
            for(j=1; j<=r-i; j++){
                System.out.print(" ");
            }
            for(j=1; j<=2*i-1; j++){
                System.out.print("*");
            }System.out.println();
        }
        n.close();
    }
}
