import java.util.Scanner;
public class Practica0{
    public static void main(String [] args){
        //ENTRADA
        double [] cocientes = lecturaDatos();
        double [] resultados = formulaGeneral2G(0,0,0);
        System.out.println(resultados.length);
    }
    public static void imprimirFormula(double a, double b, double c){
        System.out.println(String.format("%.2f", a)+"x^2 + "+String.format("%.2f", b)+ "x + "+String.format("%.2f", c));
    }

    public static double lecturaDouble(String mss){
        Scanner entrada = new Scanner(System.in);
        entrada.close();
    }
    public static double[] lecturaDatos(){
        double[] coef = new double[3];
        
        for(int i=0; <3; i++){
            System.out.println("")
            coef[i] = entrada.nextDouble();
        }
    }
    
    public static double[] formulaGeneral2G(double a, double b, double c){
        double [] raices = new double[0];
        if(a==0){
            if(b==0)
                System.out.println("No hay raices que encontrar");
            else{
                raices = new double[1];
                raices[0] = (-c/b);
            }
        } else {
            double n = sq(b) -4*a*c;
            if(n<0)
                System.out.println("No hay raices en los Reales");
            else {
                raices = new double[2];
                raices[0] = (-b + Math.sqrt(n))/2*a;
                raices[1] = (-b - Math.sqrt(n))/2*a;
            }
        }
        return raices;
    }
}
public class poo{
    public class tools{

    }
    public class math{
        public static double sq(double a){
            return a*a;
        }
    }
}