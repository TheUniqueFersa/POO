package mx.unam.fi.poo.g1.p910.Ej1;
import mx.unam.fi.poo.g1.p910.Ej1.OperacionMatematica;
import mx.unam.fi.poo.g1.p910.Ej1.RaizNegativaException;

public class Ejercicio1 {
    public static void main(String[] args){
        OperacionMatematica operacion = new OperacionMatematica();
        try {
            double resultado = operacion.raizCuadrada(-9);
            System.out.println("REsultado: " + resultado);
        } catch (RaizNegativaException e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}
