package P1;

import java.util.Random;

public class Punto {

    private double x;

    private double y;
    Random random = new Random();

    public  Punto (double x, double y){
        this.x=x;
        this.y=y;
    }
    public Punto (){
       /* x=random.nextDouble(0,101);
        y=random.nextDouble(0,101);*/
    }

    public double getX() {
        return x;
    }
    public double getY(){
        return y;
    }
    public double calcularDistanciaDesde(Punto punto1){

    double distanciaEjex= punto1.getX()-x;
    double distanciaEjey= punto1.getY()-y;

    return Math.sqrt(Math.pow(distanciaEjex,2)+Math.pow(distanciaEjey,2));



    }
}
