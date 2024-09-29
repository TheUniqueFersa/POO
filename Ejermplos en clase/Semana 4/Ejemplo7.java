import java.util.Hashtable;

public class Ejemplo7 {
    public static void main(String[] args) {
        Hashtable<String, Integer> miTabla = new Hashtable<String, Integer>();
        miTabla.put("uno", 1);
        miTabla.put("dos", 2);
        miTabla.put("cinco", 5);

        System.out.println("¿La estrucutra contiene a cuatro?" + miTabla.containsKey("cuatro"));

        for (String claves : miTabla.keySet()) {
            System.out.println(claves);
        }
        for (Integer valor : miTabla.values()) {
            System.out.println(valor);
        }
    }    
}