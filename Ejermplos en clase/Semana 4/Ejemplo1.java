public class Ejemplo1 {
    public static void main(String[] args) {
        //Declarar e inicializar dos variables string
        String cad1 = "Esto es ejemplo 1";
        String cad2 = "Esto es Ejemplo 1";

        //Se imprimen las cadenas
        System.out.println("Cadena 1: " + cad1);
        System.out.println("Cadena 2: " + cad2);

        //Comparamos las dos cadenas ignorando el Case Sensitive y damos el resultado de la comparación
        int r = cad1.compareToIgnoreCase(cad2);

        //Mostramos resultado de la comparación
        if (r < 0) {
            //Si cad1 (ignorando Case Sensitive) es menor que cad2
            System.out.println("\"" + cad1 + "\"" 
            + " es menor que " 
            + "\"" + cad2 + "\"");
        } else if (r == 0) {
            //cad1 (ignorando Case Sensitive) es igual que cad2
            System.out.println("\"" + cad1 + "\"" 
            + " es igual que " 
            + "\"" + cad2 + "\"");
        } else {// if (r > 0)
            //cad1 (ignorando Case Sensitive) es mayor que cad2
            System.out.println("\"" + cad1 + "\"" 
            + " es mayor que " 
            + "\"" + cad2 + "\"");
        }
    }
}