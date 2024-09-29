public class Ejemplo2 {
    public static void main(String[] args) {
        String cad1 = "Esto es un ejemplo ";
        String cad2 = "de ejercicios para practica";

        System.out.println("Cadena 1: " + cad1);
        System.out.println("Cadena 2: " + cad2);

        String cad3 = cad1.concat(cad2);

        System.out.println("La cadena concatenada es: " + cad3);
    }
}