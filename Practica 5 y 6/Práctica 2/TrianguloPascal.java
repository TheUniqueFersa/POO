package mx.unam.fi.poo.g1.p56.p2;
/**
 * Clase que implementa el triangulo de pascal
 * @version 1.0 2024-09-27
 * @author Fernando López, Grupo 1 POO
 */
public class TrianguloPascal {
    private int filas;
    /**
     * Constructor de la clase
     * @param filas numero de filas del triangulo
     */
    public TrianguloPascal(int filas){
        setFilas(filas);
    }
    /**
     * Metodo set
     * @param filas Para cambiar el numero de filas del triangulo, en caso de ser menor o igual a 0 se establece 1
     */
    public void setFilas(int filas){
        if(filas <= 0){
            System.out.println("El triangulo de pascal no puede tener 0 o menos filas, se ha establecido 1 fila");
            this.filas = 1;
        } else {
            this.filas = filas;
        }
    }
    /**
     * Metodo get
     * @return filas: numero de filas del triangulo
     */
    public int getFilas(){
        return filas;
    }
    /**
     * Metodo que imprime el triangulo de pascal de acuerdo al numero de filas que tenga el objeto
     */
    public void imprimirTriangulo(){
        //Note que i es cada fila
        for (int i = 0; i <getFilas(); i++) {
            // For que imprime los espacios en blanco para el correcto desplazamiento de cada numero
            for (int j =0; j < getFilas() - i - 1; j++) {
                System.out.print(" ");
            }
            int coeficienteBinomial = 1;
            //Note que j es cada "columna"
            for (int j=0; j<=i; j++) {
                System.out.print(coeficienteBinomial + " ");
                coeficienteBinomial = coeficienteBinomial * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

}
