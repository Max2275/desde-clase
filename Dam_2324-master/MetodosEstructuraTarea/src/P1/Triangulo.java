package P1;

import java.util.Random;

public class Triangulo {
    private Punto vertice;
    private  Punto vertice2;
    private Punto vertice3;

    public Triangulo(Punto vertice, Punto vertice2, Punto vertice3) {
        this.vertice = vertice;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    public Triangulo(double x, double y, double z, double a, double b, double c) {
        this.vertice = new Punto(x, y);
        this.vertice2 = new Punto(z, a);
        this.vertice3 = new Punto(b, c);
    }




}
