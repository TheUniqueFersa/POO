package mx.unam.fi.poo.g1.p56.p31;
/**
 * Clase que reemplaza un caracter por otro en una cadena
 * @version 1.0 2024-09-27
 * @author Fernando López, Grupo 1 POO
 */
public class CadReemplazo {
    private char anterior, nuevo;
    private String cad;
    /**
     * Constructor de la clase
     * @param cad Cadena a la que se le hara el reemplazo
     * @param anterior Caracter que se va a reemplazar
     * @param nuevo Caracter por el que se va a reemplazar
     */
    CadReemplazo(String cad, char anterior, char nuevo){
        setAnterior(anterior);
        setNuevo(nuevo);
        setCad(cad);
    }
    /**
     * Metodo set
     * @param anterior Para cambiar el caracter anterior
     */
    public void setAnterior(char anterior){
        this.anterior = anterior;
    }
    /**
     * Metodo set
     * @param nuevo Para cambiar el caracter nuevo
     */
    public void setNuevo(char nuevo){
        this.nuevo = nuevo;
    }
    /**
     * Metodo set
     * @param cad Para cambiar la cadena
     */
    public void setCad(String cad){
        this.cad = cad;
    }
    /**
     * Metodo get
     * @return anterior: caracter anterior
     */
    public char getAnterior(){
        return anterior;
    }
    /**
     * Metodo get
     * @return nuevo: caracter nuevo
     */
    public char getNuevo(){
        return nuevo;
    }
    /**
     * Metodo get
     * @return cad: cadena
     */
    public String getCad(){
        return cad;
    }
    /**
     * Reemplaza el caracter anterior por el nuevo en la cadena
     * @return cad: cadena con el reemplazo
     */
    public String reemplazar(){
        return cad.replace(getAnterior(), getNuevo());
    }
    /**
     * Metodo sobrecargado. Reemplaza el caracter 'a' por 'n' en la cadena, esto no sobreescribe las variables del objeto
     * @param a Caracter a reemplazar
     * @param n Caracter por el que se va a reemplazar
     * @return cad: cadena con el reemplazo
     */
    public String reemplazar(char a, char n){
        return cad.replace(a, n);
    }
}
