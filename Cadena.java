package mx.unam.fi.poo.g1.p910.Practica;

/**
 * Clase que contiene un método que verifica si una cadena contiene vocales
  * @version 1.0 26/10/2024
  * @author Fernando Lopez Morales Grupo 1 POO
 */
public class Cadena{
    /**
     * Método que verifica si una cadena contiene vocales
     * @param cadena Cadena a verificar
     * @return true si la cadena contiene vocales, false en caso contrario
     * @throws StringContieneVocalException si la cadena no contiene vocales
     */
    public boolean contVocales(String cadena) throws StringContieneVocalException{
        cadena = cadena.toLowerCase();
        char c;
        for(int i = 0; i<cadena.length(); i++){
            c = cadena.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                return true;
            }
        }
        throw new StringContieneVocalException("La cadena NO contiene vocales");
    }
}