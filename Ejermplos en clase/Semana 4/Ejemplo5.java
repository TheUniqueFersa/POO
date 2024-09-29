public class Ejemplo5 {
    public static void main(String[] args) {
        String cad = "El veloz zorro brinca encima del perro holgazan";

        String nuevaCad = cad.replaceAll("zorro", "gato");

        System.out.println("Cadena original: " + cad);
        System.out.println("Cadena modificada: " + nuevaCad);
    }    
}