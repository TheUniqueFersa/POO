package mx.unam.fi.poo.g1.p7;
import mx.unam.fi.poo.g1.p7.*;

/**
 * Clase principal de la Practica 7 que simula un sistema de empleados
 * @version 1.0 2024-10-04
 * @author Fernando López, Grupo 1 POO
 */
public class Practica7 {
    /**
     * Metodo principal que ejecuta todas las pruebas
     * @param args : Argumentos de la linea de comandos
     */
    public static void main(String[] args) {
        //Empleado[] empleados = new Empleado[3]; //Aun no puedo implementar polimorfismo
        Manager m1 = new Manager("Juan", 10000, "Calle Rosas", "Manager");
        Desarrollador d1 = new Desarrollador("Pedro", 8000, "Calle Orquideas", "Desarrollador");
        Programador p1 = new Programador("Pablo", 5000, "Calle Bamboo", "Programador");

        //Pruebas con Manager:
        System.out.println(m1.generarReporteDesempenio("Nulo"));
        System.out.println("Bono: " + m1.obtenerBono());
        m1.manejoProyectos();
        m1.manejoProyectos("Buscador para la empresa");
        m1.terminarTrabajo();

        m1.manejoProyectos(); //Se espera que no tenga trabajo asignado
        System.out.println();

        m1.manejoProyectos("Navbar Landing Page");
        m1.terminarTrabajo();


        System.out.println(m1.generarReporteDesempenio("Bueno"));
        System.out.println();


        //Pruebas con Desarrollador:
        System.out.println(d1.generarReporteDesempenio("Nulo"));
        System.out.println("Bono: " + d1.obtenerBono());

        d1.manejoProyectos();
        d1.manejoProyectos("Sistema de control de inventarios");
        d1.terminarTrabajo();
        d1.manejoProyectos("Conectar base de datos con interfaz grafica");
        d1.terminarTrabajo();
        d1.manejoProyectos("API para la empresa");
        d1.terminarTrabajo();

        System.out.println(d1.generarReporteDesempenio("Regular"));

        System.out.println();

        //Pruebas con Programador:
        System.out.println(p1.generarReporteDesempenio("Nulo"));
        System.out.println("Bono: " + p1.obtenerBono());

        p1.manejoProyectos();
        p1.manejoProyectos("Maquetado de Landing Page");
        p1.terminarTrabajo();
        p1.manejoProyectos("Mantenimiento de la base de datos");
        p1.terminarTrabajo();
        p1.manejoProyectos("Correcciones en el sistema de configuracion de usuarios");
        p1.terminarTrabajo();
        p1.manejoProyectos("Correcciones en buscador");
        p1.terminarTrabajo();

        System.out.println(p1.generarReporteDesempenio("Sobresaliente"));
    }
}
