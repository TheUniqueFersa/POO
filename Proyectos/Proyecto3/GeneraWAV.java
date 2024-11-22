//package mx.unam.fi.poo.g1.Proyecto3;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Clase que genera un archivo WAV con una señal senoidal.
 */
public class GeneraWAV{
    /**
     * Convierte un short a un arreglo de bytes en formato little-endian.
     * @param valor Short a convertir.
     * @return Arreglo de bytes en formato little-endian.
     */
    private byte[] convertEndiannessShort(short valor) {
        byte[] resultado;
        byte b1 = (byte)(( valor >> 8 ) & 0xFF) ;
        byte b0 = (byte)( valor  & 0xFF) ;
        resultado = new byte[ ]{ b0 ,  b1 };
        return resultado;
    }
    /**
     * Convierte un entero a un arreglo de bytes en formato little-endian.
     * @param valor Entero a convertir.
     * @return Arreglo de bytes en formato little-endian.
     */
    private byte[] convertEndiannessInt(int valor) {
        byte[] resultado;
        byte b3 = (byte)(( valor >> 24) & 0xFF) ;
        byte b2 = (byte)(( valor >> 16) & 0xFF) ;
        byte b1 = (byte)(( valor >> 8 ) & 0xFF) ;
        byte b0 = (byte)( valor  & 0xFF) ;
        resultado = new byte[ ]{ b0 ,  b1 , b2 , b3 };
        return resultado;
    }
    /**
     * Genera un archivo WAV con una señal senoidal.
     * @param nombre Nombre del archivo WAV a generar.
     * @param iTiempo Duración de la señal en segundos.
     * @param iFrecuenciaMuestreo Frecuencia de muestreo en Hz.
     * @param iArmonico Número de armónico de la señal.
     * @throws IllegalArgumentException Si alguno de los parámetros es inválido.
     * @throws IOException Si ocurre un error al escribir el archivo WAV.
     * @throws FileNotFoundException Si no se encuentra el archivo de entrada.
     */
    public void Escribe(String nombre, int iTiempo, int iFrecuenciaMuestreo, int iArmonico) throws IllegalArgumentException {
        if (nombre == null || iTiempo <= 0 || iFrecuenciaMuestreo <= 0 || iArmonico <= 0) {
            throw new IllegalArgumentException("Parámetros inválidos para generar el archivo WAV.");
        }

        int numMuestras = iTiempo * iFrecuenciaMuestreo;
        int amplitud = 32767; // Máxima amplitud para 16 bits (int16)
        byte[] datosAudio = new byte[numMuestras * 2]; // 2 bytes por muestra (16 bits)

        double tiempo; 
        short muestra;
        for (int i = 0; i < numMuestras; i++) {
            tiempo = (double)i / iFrecuenciaMuestreo;
            muestra = (short) (amplitud * Math.sin(2 * Math.PI * iArmonico * tiempo));
            datosAudio[i * 2] = (byte) (muestra & 0xFF); // Byte menos significativo
            datosAudio[i * 2 + 1] = (byte) ((muestra >> 8) & 0xFF); // Byte más significativo
        }

        try {
            FileOutputStream fos = new FileOutputStream(nombre);
            
            long tamanoArchivo = 36 + datosAudio.length;

            fos.write("RIFF".getBytes());
            fos.write(convertEndiannessInt((int)tamanoArchivo)); // Tamaño del archivo - 8 bytes
            fos.write("WAVEfmt".getBytes());
            //fos.write(" ".getBytes());
            fos.write(convertEndiannessInt(16)); // Tamaño del bloque fmt
            fos.write(convertEndiannessShort((short) 1)); // Formato PCM
            fos.write(convertEndiannessShort((short) 1)); // Monoaural

            fos.write(convertEndiannessInt(iFrecuenciaMuestreo)); // Frecuencia de muestreo
            fos.write(convertEndiannessInt(iFrecuenciaMuestreo * 2)); // Bytes por segundo
            fos.write(convertEndiannessShort((short) 2)); // Bytes por muestra
            fos.write(convertEndiannessShort((short) 16)); // Bits por muestra
            fos.write("data".getBytes());
            fos.write(convertEndiannessInt(datosAudio.length)); // Tamaño de los datos
            fos.write(datosAudio); // Datos de audio
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo WAV.");
            e.printStackTrace();
        }
    }
}