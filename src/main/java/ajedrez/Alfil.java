package ajedrez;

public class Alfil extends Pieza {
    public Alfil(String color) {
        super(color);
    }

    public Alfil() {

    }

    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        boolean aux=false;
        if (mov.esDiagonal())
            aux=true;
        return aux;
    }
}
