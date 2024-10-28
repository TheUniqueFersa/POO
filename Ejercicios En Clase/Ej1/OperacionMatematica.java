package mx.unam.fi.poo.g1.p910.Ej1;

class OperacionMatematica{
    public double raizCuadrada(double numero) throws RaizNegativaException{
        if(numero < 0){
            throw new RaizNegativaException("No se puede calcular la raiz");
        }
        return Math.sqrt(numero);
    }
}
