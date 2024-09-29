import java.util.ArrayList;

public class Ejemplo6 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(10);
        arr.add(80);
        arr.add(50);
        arr.add(1, 90);
        System.out.println("El tamaño del arraylist es " + arr.size());
        System.out.println("Elemento en la posicion 3: " + arr.get(3));
        for (Integer elemento : arr) {
            System.out.println(elemento);
        }
    }
}