package mx.unam.fi.poo.g1.p910.Ej2;
import java.util.*;
import mx.unam.fi.poo.g1.p910.Ej2.NumeroDuplicadoException;
import mx.unam.fi.poo.g1.p910.Ej2.IngresaUsuario;


public class Ejercicio2{
    public static void main(String[] args) {
        try {
            List<Integer> numeros = IngresaUsuario.leerNumerosUsuario();
            RevisionDuplicado.checarDuplicado(numeros);
            System.out.println("NO hay numeros duplicados!");
        } catch (NumeroDuplicadoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}