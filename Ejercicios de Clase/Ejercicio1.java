package mx.unam.fi.poo.g1.p8.e1;
import mx.unam.fi.poo.g1.p8.e1.*;
public class Ejercicio1{
    public static void main(String[] args){
        Figura circulo = new Circulo(7.0);
        Figura cilindro = new Cilindro(4.0, 9.0);

        dibujaCalcula(circulo);
        dibujaCalcula(cilindro);

    }
    public static void dibujaCalcula(Figura figura){
        figura.dibuja();
        double area = figura.calculaArea();
        System.out.println("Area: " + area);
    }
}