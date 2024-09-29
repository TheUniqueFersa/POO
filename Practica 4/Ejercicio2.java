class Circulo{
    final double PI = 3.14159;
    double radio = 0.0;
    public Circulo(double r){
        this.radio = r;
    }
    public double areaC(){
        return PI * radio * radio;
    }
    public double perimetroC(){
        return 2 * PI * radio;
    }
}
public class Ejercicio2{
    public static void main(String [] args){
        Circulo c = new Circulo(5.0);
        System.out.println("El radio del circulo es "
        + c.radio);
        System.out.println("El area del circulo es "
        + c.areaC());
        System.out.println("El perimetro del circulo es "
        + c.perimetroC());
        System.out.println();
        c.radio = 8.0;
        System.out.println("Ahora el radio es " + c.radio);
        System.out.println("Ahora el area es " + c.areaC());
        System.out.println("Ahora el perimetro es " + c.perimetroC());
    }
}