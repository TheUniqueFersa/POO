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
        try {
            // do{
            //     System.out.println("");
            // }
            // entrada.nextLine()
            String caa = "Hlll";
            cad.contVocales(caa);
            System.out.println("La cadena: " + caa + " tiene vocales");
        } catch (StringContieneVocalException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}