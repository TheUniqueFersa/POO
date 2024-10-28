package mx.unam.fi.poo.g1.p910.Practica;
import java.util.Scanner;
import mx.unam.fi.poo.g1.p910.Practica.Cadena;
import mx.unam.fi.poo.g1.p910.Practica.StringContieneVocalException;

/**
 * Clase que contiene un método que verifica si una cadena contiene vocales
 * @version 1.0 26/10/2024
 * @author Fernando Lopez Morales Grupo 1 POO
 */
public class Practica910{
    /**
     * Método principal
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        Cadena cad = new Cadena();
        String ent = "";
        do{
            try {
                System.out.println("Ingresa una cadena: ");
                ent = entrada.nextLine();
                if(!ent.equalsIgnoreCase("-1")){
                    cad.contVocales(ent);
                    System.out.println("-> La cadena: \"" + ent + "\" SI tiene vocales\n\n");
                } else {
                    System.out.println("Vuelva pronto :)\n");
                }
            } catch (StringContieneVocalException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while(!ent.equalsIgnoreCase("-1"));
    }
}