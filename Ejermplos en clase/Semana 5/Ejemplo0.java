class Punto {
    int x, y = 0;

    public void imprimePunto() {
        System.out.println("Punto (x= " 
        + x + ", y= " + y + ")");
    }
}

public class Ejemplo0 {
    public static void main(String[] args) {
        Punto p = new Punto();
        p.x = 5;
        p.y = 8;
        p.imprimePunto();

        Punto q = new Punto();
        q.x = 7;
        q.y = 2;
        q.imprimePunto();
    }
}
