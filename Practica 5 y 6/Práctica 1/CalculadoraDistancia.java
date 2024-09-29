package mx.unam.fi.poo.g1.p56.p1;
/**
 * Clase que calcula la distancia entre dos puntos de la tierra
 * @version 2.0 2024-09-27
 * @author Fernando López, Grupo 1 POO
 * 
 */
public class CalculadoraDistancia{
    private double x1, y1, x2, y2, distancia;
    final private double radioTierra = 6371.01;

    /**
     * Convierte grados a radianes
     * @param degrees -> valor en grados
     * @return radianes: valor en radianes
     */
    public double degToRad(double degrees){
        return (Math.PI * degrees)/180;
    }
    /**
     * Calcula la distancia entre dos puntos de la tierra
     * @return distancia: distancia entre los dos puntos
     */
    public double calcularDistancia(){
        if(x1==x2 && y1==y2){
            setDistancia(0);
        } else {
            setDistancia(radioTierra * (Math.acos(Math.sin(getX1())*Math.sin(getX2()) + Math.cos(getX1())*Math.cos(getX2())*Math.cos(getY2()-getY1()))));
        }
        return getDistancia();
    }
    
    /**
     * Metodo set
     * @param x1 : Para cambiar la coordenada x del punto 1
     */
    public void setX1(double x1){
        this.x1 = degToRad(x1);
    }
    /**
     * Metodo set
     * @param y1 : Para cambiar la coordenada y del punto 1
     */
    public void setY1(double y1){
        this.y1 = degToRad(y1);
    }
    /**
     * Metodo set
     * @param x2 : Para cambiar la coordenada x del punto 2
     */
    public void setX2(double x2){
        this.x2 = degToRad(x2);
    }
    /**
     * Metodo set
     * @param y2 : Para cambiar la coordenada y del punto 2
     */
    public void setY2(double y2){
        this.y2 = degToRad(y2);
    }
    /**
     * Metodo get
     * @return x1 : coordenada x del punto 1
     */
    public double getX1(){
        return x1;
    }
    /**
     * Metodo get
     * @return y1 : coordenada y del punto 1
     */
    public double getY1(){
        return y1;
    }
    /**
     * Metodo get
     * @return x2 : coordenada x del punto 2
     */
    public double getX2(){
        return x2;
    }
    /**
     * Metodo get
     * @return y2 : coordenada y del punto 2
     */
    public double getY2(){
        return y2;
    }
    /**
     * Metodo get
     * @return distancia : distancia entre los dos puntos
     */
    public double getDistancia(){
        return distancia;
    }
    /**
     * Metodo set
     * @param distancia distancia entre los dos puntos
     */
    public void setDistancia(double distancia){
        this.distancia = distancia;
    }
    
}
