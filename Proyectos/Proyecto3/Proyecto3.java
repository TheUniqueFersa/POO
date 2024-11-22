//package mx.unam.fi.poo.g1.Proyecto3;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import mx.unam.fi.poo.g1.Proyecto3.GeneraWAV;

public class Proyecto3 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java Proyecto3 <archivo_entrada.txt>");
            return;
        }

        String archivoEntrada = args[0];

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivoEntrada));
            String nombreArchivo = br.readLine();
            int frecuenciaMuestreo = Integer.parseInt(br.readLine());
            int canales = Integer.parseInt(br.readLine());
            int frecuenciaSenal = Integer.parseInt(br.readLine());
            int tiempo = Integer.parseInt(br.readLine());

            if (canales != 1) {
                throw new IllegalArgumentException("Este programa solo soporta sonido monoaural.");
            }

            GeneraWAV generador = new GeneraWAV();
            generador.Escribe(nombreArchivo, tiempo, frecuenciaMuestreo, frecuenciaSenal);

            System.out.println("Archivo WAV generado exitosamente: " + nombreArchivo);
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo de entrada.");

        } catch (IOException e ) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
