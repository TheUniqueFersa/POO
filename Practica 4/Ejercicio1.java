class Rectangulo{
    double altura, anchura = 0.0;

    public Rectangulo(double al, double an){
        this.altura = al;
        this.anchura = an;
    }
    public double areaRec(){
        return altura * anchura;
    }
    public double perimetroRec(){
        return 2 * (altura + anchura);
    }
}
public class Ejercicio1{
    public static void main(String [] args){
        Rectangulo r = new Rectangulo(7.0, 12.0);
        System.out.println("El area del rectangulo es "
        + r.areaRec());
        System.out.println("El perimetro del rectangulo es "
        + r.perimetroRec());

        System.out.println();
        r.altura = 6.0;
        r.anchura = 12.0;
        System.out.println("Ahora el area es " + r.areaRec());
        System.out.println("Ahora el perimetro es " + r.perimetroRec());
        System.out.println();
    }
}