public class Ejercicio2 {
    static String palabrasReversa(String s1){
        //Creamos objeto StringBuilder y revertimos la caedna dada
        StringBuilder sb = new StringBuilder(s1);
        String invertida = sb.reverse().toString();

        //DIvidmos la cadena invertida en palabras
        String[] palabras = invertida.split(" ");

        //Creamos StringBuilder para almaecnar las palabras invertidas
        StringBuilder si = new StringBuilder();

        //Iteramos sobre cada palabra, la invertimos y agregamos a la cadena resultante
        for(String tmp : palabras){
            sb = new StringBuilder(tmp);
            si.append(sb.reverse()+ " ");
        }

        //Eliminamos espacios sobrantes y regresamos la cadena con palabras invertidas
        si.deleteCharAt(si.length()-1);
        return si.toString();
    }
    public static void main(String[] args){
        String cad1 = "Palabras invertidas en una cadena dada";
        System.out.println("La cadena dada es: "+cad1);
        System.out.println("La nueva cadena despues de invertir las palabras es: "+ palabrasReversa(cad1));
    }
}
