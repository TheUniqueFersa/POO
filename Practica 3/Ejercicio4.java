import java.util.HashMap;
public class Ejercicio4 {
    public static void main(String[ ]args) {
        HashMap<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("Rojo", 1);
        mapa.put("Verde", 2);
        mapa.put("Negro", 3);
        mapa.put("Blanco", 4);
        mapa.put("Azul", 5);

        //Imprimimos el Hashmap

        System.out.println("EL mapa original es: "+ mapa);
        System.out.println("1.- la llave \"Verde\" existe?");
        if(mapa.containsKey("Verde")){
            System.out.println("¡Si - !" + mapa.get("Verde"));
        } else{
            System.out.println("No...");
        }
        System.out.println("2.- la llave \"Naranja\" existe?");
        if(mapa.containsKey("Naranja")){
            System.out.println("¡Si - !" + mapa.get("Naranja"));
        } else{
            System.out.println("No...");
        }
    }
}
