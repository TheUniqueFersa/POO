import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String [] args){
        Scanner en = new Scanner(System.in);
        System.out.print("Ingresa un número: ");
        int n = en.nextInt();
        int cont1 = 1;
        int cont2 = 1;
        char c = 'A';
        en.close();
        for(int i = 1; i < (n * 2); i++){
            for(int e = n - cont2; e>0; e--){
                System.out.print(" ");
            }
            if(i < n){
                cont2++;
            } else {
                cont2--;
            }
            for(int j = 1; j <= cont1; j++){
                System.out.print(c);
                if(j < cont1 / 2 + 1){
                    c++;
                } else {
                    c--;
                }
            }
            if(i < n){
                cont1 += 2;
            } else {
                cont1 -= 2;
            }
            c = 'A';
            System.out.println();
        }
    }
}
