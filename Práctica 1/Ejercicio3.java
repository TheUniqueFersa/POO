//Programa que imprime los números entre 1 y 100 que sean divisbles entre 3, 5 y ambos números
public class Ejercicio3{
    public static void main(String[] args){
        System.out.println("\nDivisores de 3:");
        for(int i=1; i<100; i++){
            if(i%3 == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println("\nDivisores 5: ");
        for(int i=1; i<100; i++){
            if(i%5 == 0){
                System.out.print(i + ", ");

            }
        }
        System.out.println("\nDivisores de 3 y de 5: ");
        for(int i=1; i<100; i++){
            if(i%5 == 0 && i%5 == 0){
                System.out.print(i + ", ");
            }
        }        
    }
}

