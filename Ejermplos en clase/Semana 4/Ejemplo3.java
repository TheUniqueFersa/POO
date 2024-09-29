public class Ejemplo3 {
    public static void main(String[] args) {
        String cad = "El velos sorro brinca encima del perro holgasan";

        String nuevaCad = cad.replace('s', 'z');

        System.out.println("Cadena original: " + cad);
        System.out.println("Cadena modificada: " + nuevaCad);
    }
}