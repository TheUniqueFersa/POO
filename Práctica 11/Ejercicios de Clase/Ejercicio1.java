package mx.unam.fi.poo.g1.p11.ejClase.Ej1;
import java.io.*;
public class Ejercicio1 {
    public static void main(String[] args) {
        //StringBuilder sb = new StringBuilder();
        String strLine = "";
        String str_data = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("./test.txt"));
            while(strLine != null){
                if(strLine == null ){
                    break;
                }
                str_data += strLine;
                strLine = br.readLine();
            }
            System.out.println(str_data);
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado ... ");
        } catch (IOException e){
            System.err.println("No es posible leer el archivo ... ");
        }
    }
}
