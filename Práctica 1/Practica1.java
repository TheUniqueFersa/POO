import java.util.Scanner;
public class Practica1{
    public static double degToRad(double degrees){
        return (Math.PI * degrees)/180;
    }
    public static double calcularDistancia(double x1, double y1, double x2, double y2){
        double radioTierra = 6371.01;
        return radioTierra * (Math.acos(Math.sin(x1)*Math.sin(x2) + Math.cos(x1)*Math.cos(x2)*Math.cos(y2-y1)));
    }

    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("\n\n== Bienvenido a la Practica 1 ==\nEsta aplicacion calcula la distancia entre dos puntos de la tierra");
        boolean flag = true;
        double x1, y1, x2, y2, distancia;
        System.out.print("Ingrese las coordenadas del punto 1:\nLatitud (x1): ");
        x1 = entrada.nextDouble();
        System.out.print("\nLongitud (y1): ");
        y1 = entrada.nextDouble();
        System.out.print("\nIngrese las coordenadas del punto 2:\nLatitud (x2): ");
        x2 = entrada.nextDouble();
        System.out.print("\nLongitud (y2): ");
        y2 = entrada.nextDouble();
        entrada.close();
        if(x1==x2 && y1==y2){
            distancia=0;
        } else {
            distancia = calcularDistancia(degToRad(x1), degToRad(y1), degToRad(x2), degToRad(y2));
        }
        System.out.printf("\nLa distancia entre \nel punto 1: (%f, %f)\ny el punto 2: (%f, %f)\n\nes : %.4f km\n", x1, y1, x2, y2, distancia);
        System.out.println("\n==Gracias por usar la aplicacion. Saliendo del programa...==\n");
    }
}