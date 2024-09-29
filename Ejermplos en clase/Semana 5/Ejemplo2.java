class Punto {
    int x, y = 0;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {}

    public void imprimePunto() {
        System.out.println("Punto (x= " 
        + x + ", y= " + y + ")");
    }
}

public class Ejemplo2 {
    public static void main(String[] args) {
        Punto p = new Punto(5, 8);
        p.imprimePunto();

        Punto q = new Punto();
        q.x = 7;
        q.y = 2;
        q.imprimePunto();
    }
}