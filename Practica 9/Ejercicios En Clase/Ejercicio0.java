
class DivisionPorCeroException extends Exception{
    public DivisionPorCeroException(String mensaje){
        super(mensaje);
    }
}

class OperacionMatematica{
    public double dividir(double numerador, double denominador) throws DivisionPorCeroException{
        if(denominador == 0){
            throw new DivisionPorCeroException("NO es posible dividir entre 0");
        }
        return numerador/denominador;
    }
}

public class Ejercicio0 {
    public static void main(String[] args){
        OperacionMatematica operacion = new OperacionMatematica();
        try {
            double resultado = operacion.dividir(10, 0);
            System.out.println("REsultado: " + resultado);
        } catch (DivisionPorCeroException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}