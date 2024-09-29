import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args){
        ArrayList<String> colores1 = new ArrayList<String>();
        colores1.add("Rojo");
        colores1.add("Verde");
        colores1.add("Negro");
        colores1.add("Blanco");

        ArrayList<String> colores2 = new ArrayList<String>();
        colores2.add("Rojo");
        colores2.add("Verde");
        colores2.add("Negro");
        colores2.add("Rosa");

        //Almacenamos el resultado de la comparacion en otro ArrayList
        ArrayList<String> colores3 = new ArrayList<String>();
        for(String tmp : colores1){
            colores3.add((colores2.contains(tmp) ? "Si" : "No"));
        }
        System.out.println(colores3);

    }
}
