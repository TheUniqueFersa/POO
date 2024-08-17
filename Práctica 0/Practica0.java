import java.util.Scanner;
public class Practica0{
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        String comando = "";
        System.out.println("\n\n== Bienvenido a la Practica0 ==\nEsta aplicacion devuelve el valor de las raices de una ecuacion de segundo grado.\nPara ello, se le solicita al usuario ingresar los valores de los coeficientes a, b y c");
        while(!comando.equalsIgnoreCase("EXIT")){
            System.out.println("\n---\n - Da ENTER para continuar... | Ingresa la palabra \"EXIT\" para salir del programa");
            comando = entrada.nextLine();
            if(comando.isEmpty()){
                System.out.println("Ingresa los valores de a, b y c");
                double [] coef;
                double [] resultados;
                do{
                    coef = lecturaDatos();
                    resultados = formulaGeneral2G(coef[0], coef[1], coef[2]); //a, b, c
                    if(resultados.length < 1){
                        System.out.println("Ingresa nuevamente");
                    }
                } while(resultados.length < 1);
                System.out.println("\nSea la ecuacion con los valores dados: ");
                imprimirFormula(coef[0], coef[1], coef[2]);
                System.out.printf("Tiene la%s siguiente%s solucion%s:\n", (resultados.length>1)? "s":"", (resultados.length>1)? "s":"", (resultados.length>1)? "es":"");
                for(int i=0; i<resultados.length; i++){
                    System.out.println("\n - x" + (i+1) + ": " + resultados[i]);
                }
            } else if(comando.equalsIgnoreCase("EXIT")){
                System.out.println("\n==Gracias por usar la aplicacion. Hasta pronto!==\n");
            } else {
                System.out.println("\n-Comando no reconocido, intenta de nuevo-");
            }
            
        }
        entrada.close();
    }
    public static double[] lecturaDatos(){
        double[] coef = new double[3];
        char [] peticiones = {'a', 'b', 'c'};
        for(int i=0; i<3; i++){
            coef[i] = lecturaDouble("Ingresa el coeficiente " + peticiones[i] + ": ");
        }
        return coef;
    }
    public static double lecturaDouble(String mss){
        Scanner entrada = new Scanner(System.in);
        boolean valida = false;
        String linea;
        double n = 0.0;
        while(!valida){
            System.out.print(mss);
            linea = entrada.nextLine();
            try {
                n = Double.parseDouble(linea);
                valida = true;
            } catch(NumberFormatException e){
                System.out.println("-!- Lo que ingresaste no es numerico, intenta de nuevo -");
            }
        }
        return n;
    }
    public static double[] formulaGeneral2G(double a, double b, double c){
        double [] raices = new double[0];
        if(a==0){
            if(b==0)
                System.out.println("\nNo hay raices que encontrar\n");
            else{
                raices = new double[1];
                raices[0] = (c==0)? 0 : (-c/b);
            }
        } else {
            double n = sq(b) -4*a*c;
            if(n<0)
                System.out.println("\nNo hay raices en los Reales\n");
            else {
                raices = new double[2];
                raices[0] = ((-b + Math.sqrt(n))==0)? 0 : (-b + Math.sqrt(n))/2*a;
                raices[1] = ((-b - Math.sqrt(n))==0)? 0 : (-b - Math.sqrt(n))/2*a;
            }
        }
        return raices;
    }
    public static void imprimirFormula(double a, double b, double c){
        System.out.println(String.format("%.2f", a)+"x^2 + "+String.format("%.2f", b)+ "x + "+String.format("%.2f", c));
    }
    public static double sq(double a){
        return a*a;
    }    
}    