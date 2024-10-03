class Figura{
    public double area(){
        return 0.0;
    }
}

class Rectangulo extends Figura{
    private double base, altura;

    public Rectangulo(double base, double altura){
        setBase(base);
        setAltura(altura);

    }
    public void setBase(double base){
        this.base = base;
    }
    public double getBase(){
        return base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return altura;
    }
    public double area(){
        return this.base * this.altura;
    }
    @Override 
    public String toString(){
        return "El area del rectangulo es: "
        + this.area();
    }
}
class Circulo extends Figura{
    private double radio;
    public Circulo(double radio){
        setRadio(radio);
    }
    public void setRadio(double radio){
        this.radio = radio;
    }
    public  double getRadio(){
        return radio;
    }
    @Override
    public double area(){
        return Math.PI * this.radio * this.radio;
    }
    @Override
    public String toString(){
        return  "El area del circulo es: "
        + this.area();
    }
}
public class Ejercicio0{
    public static void main(String[] args){
        Rectangulo rectangulo = new Rectangulo(3.0, 10.0);
        System.out.println(rectangulo);
        System.out.println();

        Circulo circulo = new Circulo(5.0);
        System.out.println(circulo);
        
    }
}