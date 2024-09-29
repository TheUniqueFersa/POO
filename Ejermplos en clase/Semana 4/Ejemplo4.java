public class Ejemplo4 {
    public static void main(String[] args) {
        String cad = "El veloz zorro brinca encima del perro holgazan";

        String nuevaCad = cad.substring(9, 28);

        System.out.println("Cadena original: " + cad);
        System.out.println("Cadena modificada: " + nuevaCad);
    }   
}