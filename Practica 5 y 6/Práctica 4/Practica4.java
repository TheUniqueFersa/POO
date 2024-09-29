package mx.unam.fi.poo.g1.p56.p4;

import java.util.ArrayList;
import java.util.Scanner;
import mx.unam.fi.poo.g1.p56.p4.*;
/**
 * Clase principal de la Practica 4 que simula una cuenta de banco
 * @version 1.0 2024-09-27
 * @author Fernando López, Grupo 1 POO
 */

public class Practica4 {
    /**
     * Metodo principal que ejecuta todas las pruebas
     * @param args : Argumentos de la linea de comandos
     */
    public static void main(String [] args){
        System.out.println("== Bienvenido al banco (Practica 4) ==");

        CuentaBanco c1 = new CuentaBanco("Maria Fernanda", "123456", 20000);
        c1.impInfoCuenta();

        c1.depositar(5000.25);
        c1.impInfoCuenta("Saldo");
        System.out.println();
        
        c1.retirar(2500.12);
        c1.impInfoCuenta("Saldo");
        System.out.println();

        c1.depositar(316.87);
        c1.depositar(-12);
        c1.retirar(100000.00);
        c1.impInfoCuenta();

        //---------
        CuentaBanco c2 = new CuentaBanco("Heriberto C.", "988765432123456789", 20000);
        c2.impInfoCuenta("Cuenta");
        System.out.println();


        //---------
        CuentaBanco c3 = new CuentaBanco("Maria Fernanda", "982", -123);
        c3.impInfoCuenta("Saldo");
        System.out.println();

        c2.impInfoCuenta();
        System.out.println();
        c3.impInfoCuenta();

    }
}