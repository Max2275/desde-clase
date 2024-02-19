package ajedrez;

public class Rey extends Pieza {
    public Rey(String color) {
        super(color);

    }
    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        boolean aux=false;
        if (Math.abs(mov.saltoHorizontal()) == 1 || Math.abs(mov.saltoVertical())==1 || mov.esDiagonal())
            aux=true;
        return aux;
    }

}
