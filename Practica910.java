//package mx.unam.fi.poo.g1.p7;

import java.util.Scanner;

class Cadena{
    //public static boolean contVocales(String s)
    public boolean contVocales(String cadena) throws StringContieneVocalException{
        char c;
        for(int i = 0; i<cadena.length(); i++){
            c = cadena.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                return true;
            }
        }
        throw new StringContieneVocalException("La cadena no contiene vocales");
    }
}

class StringContieneVocalException extends Exception{
    public StringContieneVocalException(String mensaje){
        super(mensaje);
    }
}

public class Practica910{
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
                    System.out.println("-> La cadena: " + ent + " tiene vocales\n\n");
                } else {
                    System.out.println("Vuelva pronto :)\n");
                }
            } catch (StringContieneVocalException e) {
                System.out.println("Error: " + e.getMessage());
            }
        } while(!ent.equalsIgnoreCase("-1"));
    }
}