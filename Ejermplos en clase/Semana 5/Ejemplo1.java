class Triangulo {
    double base, altura = 0.0;

    public double area() {
        return this.base * this.altura / 2;
    }

    public double area(double b, double a) {
        return b * a / 2;
    }

    public double area(int b, int a) {
        return (double) (b * a / 2);
    }
}

public class Ejemplo1 {
    public static void main(String[] args) {
        Triangulo t = new Triangulo();

        t.base = 5;
        t.altura = 8;
        System.out.println("Base: " + t.base);
        System.out.println("Altura: " + t.altura);

        System.out.print("Area() -> " + t.area() + "\n");
        System.out.print("Area(5, 8) -> " + t.area(5, 8) + "\n");
        System.out.print("Area(5.0, 8.0) -> " + t.area(5.0, 8.0) + "\n");
    }
}