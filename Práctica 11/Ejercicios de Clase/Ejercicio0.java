package mx.unam.fi.poo.g1.p11.ejClase.Ej0;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Ejercicio0{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("./test.txt"));
            while(strLine != null){
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado...");
        } catch (IOException e){
            System.err.println("No es posible leer el archivo...");
        }

    }
}
