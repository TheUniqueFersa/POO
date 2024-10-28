package mx.unam.fi.poo.g1.p910.Ej0;

public class OperacionMatematica{
    public double dividir(double numerador, double denominador) throws DivisionPorCeroException{
        if(denominador == 0){
            throw new DivisionPorCeroException("NO es posible dividir entre 0");
        }
        return numerador/denominador;
    }
}
