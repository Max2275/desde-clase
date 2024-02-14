package ajedrez;

public class Movimiento {
    protected Posicion posInicial;
    protected Posicion posFinal;

    public Movimiento(){

    }

    public Movimiento(Posicion posInicial, Posicion posFinal) {
        this.posInicial = posInicial;
        this.posFinal = posFinal;
    }
    public boolean esVertical(){
        boolean aux=false;
        if (posInicial.getColumna() == posFinal.getColumna()) {
            aux = true;
        }
        return aux ;
    }
    public boolean esHorizontal(){
        boolean aux=false;
        if (posInicial.getFila()== posFinal.getFila()) {
            aux = true;
        }
        return aux ;
    }
    public int saltoHorizontal(){
        return posFinal.getColumna() - posInicial.getColumna();
    }
    public int saltoVertical(){
        return posFinal.getFila()- posInicial.getFila();
    }
    public boolean esDiagonal(){
        return Math.abs(saltoHorizontal())==Math.abs(saltoVertical());

    }


    //METODOS
}
