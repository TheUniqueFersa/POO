package mx.unam.fi.poo.g1.p8.e1;
import mx.unam.fi.poo.g1.p8.e1.Circulo;

class Cilindro extends Circulo{
    private double altura;
    public Cilindro(double radio, double altura){
        super(radio);
        setAltura(altura);
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double getAltura(){
        return this.altura;
    }
    @Override
    public void dibuja(){
        System.out.println("Un cilindro abstracto... ay que imaginacion");
    }
    public double calculaArea(){
        double areaCirculo = super.calculaArea();
        double areaLateral = 2 * Math.PI * getRadio() * getAltura();
        return 2 * areaCirculo + areaLateral;
    }
}
