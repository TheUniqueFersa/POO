import java.util.*; //Enumeration, Hashtable

public class Ejemplo8 {
    public static void main(String[] args) {
        Hashtable<String, Integer> miTabla = new Hashtable<String, Integer>();
        miTabla.put("uno", 1);
        miTabla.put("dos", 2);
        miTabla.put("cinco", 5);

        String clave;
        Integer valor;
        Enumeration<String> claves = miTabla.keys();
        while (claves.hasMoreElements()) {
            clave = claves.nextElement();
            valor = miTabla.get(clave);
            System.out.println("Clave: " + clave + "\tValor: " + valor);
        }
    }
}