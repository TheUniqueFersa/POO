package mx.unam.fi.poo.g1.p11.ejClase.Ej2;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        List<String> list = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("./test.txt"));
            while(strLine!=null){
                strLine = br.readLine();
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                if(strLine == null){
                    break;
                }
                list.add(strLine);
            }
            System.out.println(Arrays.toString(list.toArray()));
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado...");
        } catch (Exception e){
            System.err.println("Error al abrir el archivo");
        }
    }
}
