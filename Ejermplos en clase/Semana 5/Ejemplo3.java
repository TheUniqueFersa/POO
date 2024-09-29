class Persona {
    String nombre = null;
    int edad = 0;

    public Persona(String n, int e) {
        this.nombre = n;
        this.edad = e;
    }

    public void imprimeDatos() {
        System.out.println("La persona se llama " 
        + this.nombre + " y tiene la edad de " 
        + this.edad);
    }
}

public class Ejemplo3 {
    public static void main(String[] args) {
        Persona p1 = new Persona("Angel", 19);
        Persona p2 = new Persona("Jessica", 20);

        p1.imprimeDatos();
        p2.imprimeDatos();
    }
}