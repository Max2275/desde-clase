package P1;

public class Circulo {
    private Punto centro;
    private double radio;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public Circulo() {

    }

    public Circulo(double x, double y, double z) {
        this.centro = new Punto(x, y);
        this.radio = z;
    }

    public Punto getCentro() {
        return centro;
    }

    public double getRadio() {
        return radio;
    }

    public double calcularDistanciaDesde(Punto otroPunto) {
        return centro.calcularDistanciaDesde(otroPunto) - radio;

    }

    public double calcularArea (){
        return (Math.pow(this.radio,2)*Math.PI);
    }
    public double calcularPerimetro (){
        return (2*Math.PI)*this.radio;
    }


}

