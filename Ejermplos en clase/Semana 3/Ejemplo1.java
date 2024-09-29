import java.util.Scanner;

public class Ejemplo1 {
    final static double PI = 3.14159;
    public static void main(String[] args) {
        double area;
        int opcion;

        Scanner en = new Scanner(System.in);

        do {
            System.out.println("Elige una opción");
            System.out.println("1.-Area del circulo");
            System.out.println("2.-Area del triángulo");
            System.out.println("3.-Area del cuadrado");
            System.out.println("4.-Salir");
            opcion = en.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Se seleccionó el círculo");
                    double radio = 15;
                    area = areaCirculo(radio);
                    System.out.println("El area es: " + area);
                    break;
                
                case 2: 
                    System.out.println("Se seleccionó el triángulo");
                    double base = 8, altura = 5;
                    area = areaTriangulo(base, altura);
                    System.out.println("El area es: " + area);
                    break;
                
                case 3: 
                    System.out.println("Se seleccionó el cuadrado");
                    double lado = 10;
                    area = areaCuadrado(lado);
                    System.out.println("El area es: " + area);
                    break;
                
                case 4:
                    System.out.println("Hasta luego");
                    continue;

                default:
                    System.out.println("Elección incorrecta...");
                    break;
            }
        } while (opcion != 4);
        en.close();
    }

    public static double areaCirculo(double r) {
        return PI * r * r;
    }

    public static double areaTriangulo(double b, double a) {
        return (b * a) / 2;
    }

    public static double areaCuadrado(double l) {
        return l * l;
    }
}