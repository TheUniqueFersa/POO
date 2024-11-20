package mx.unam.fi.poo.g1.p11.ejClase.Ej3;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
public class Ejercicio3 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        String srtLine = "";
        try {
            String filename = "./hola.txt";
            FileWriter fw = new FileWriter(filename, false);
            fw.write("Esto es un ejemplo de escritura en un archivo...\n");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader("./hola.txt"));
            while(srtLine != null){
                sb.append(srtLine);
                sb.append(System.lineSeparator());
                srtLine = br.readLine();
                System.out.println(srtLine);
            }
            br.close();
            
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
