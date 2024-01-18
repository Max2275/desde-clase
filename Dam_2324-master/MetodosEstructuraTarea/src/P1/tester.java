package P1;

import java.util.Random;

public class tester {
    public static void main(String[] args) {
        Random random = new Random();

        Punto punto = new Punto(2,2);
        Punto punto2 = new Punto();

        System.out.println(punto2.calcularDistanciaDesde(punto));

        //CIRCULO
        double x= random.nextDouble(0,5);
        double y= random.nextDouble(0,5);
        double z= random.nextDouble(0,5);
        Circulo circulo = new Circulo();
        Circulo circulo1= new Circulo(x,y,z);
        System.out.println(circulo1.calcularDistanciaDesde());



    }

}
