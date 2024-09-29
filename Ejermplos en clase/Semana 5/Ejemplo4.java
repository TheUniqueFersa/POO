class Perro {
    String nombre, raza = null;

    public Perro() {}

    public Perro(String n, String r) {
        this.nombre = n;
        this.raza = r;
    }

    public void imprimeDatos() {
        System.out.println("El perrito se llama " 
        + this.nombre + " y es de la raza " 
        + this.raza);
    }
}

public class Ejemplo4 {
    public static void main(String[] args) {
        Perro p1 = new Perro("Milaneso", "Pug");
        Perro p2 = new Perro();

        p2.nombre = "Sher";
        p2.raza = "Lasha apso";

        p1.imprimeDatos();
        p2.imprimeDatos();
    }
}