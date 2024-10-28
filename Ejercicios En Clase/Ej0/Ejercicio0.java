package mx.unam.fi.poo.g1.p910.Ej0;
import mx.unam.fi.poo.g1.p910.Ej0.DivisionPorCeroException;
import mx.unam.fi.poo.g1.p910.Ej0.OperacionMatematica;

public class Ejercicio0 {
    public static void main(String[] args){
        OperacionMatematica operacion = new OperacionMatematica();
        try {
            double resultado = operacion.dividir(10, 0);
            System.out.println("REsultado: " + resultado);
        } catch (DivisionPorCeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}