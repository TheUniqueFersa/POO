package mx.unam.fi.poo.g1.p7.ec1;
import mx.unam.fi.poo.g1.p7.ec1.Figura;

public class Circulo extends Figura{
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