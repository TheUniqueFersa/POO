class Empleado{
    String nombre, trabajo = null;
    double salario = 0.0;
    public Empleado(String n, String t, double s){
        this.nombre = n;
        this.trabajo = t;
        this.salario = s;
    }
    public void incrementarSalario(double porcentaje){
        salario = salario + salario * porcentaje / 100;
    }
    public void detallesEmpleado(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Titulo del puesto: " + trabajo);
        System.out.println("Salario: " + salario);
    }
}
public class Ejercicio3{
    public static void main(String [] args){
        Empleado e1 = new Empleado("Carlos Alf", "Project Manager", 20000);
        Empleado e2 = new Empleado("Maria Fernanda", "Gerente", 50);

        System.out.println("\nDetalles del empleado: ");
        e1.detallesEmpleado();
        e2.detallesEmpleado();
        e1.incrementarSalario(8);
        e2.incrementarSalario(12);
        System.out.println("\nDatos despues del incremento: ");
        e1.detallesEmpleado();
        e2.detallesEmpleado();
    }
}