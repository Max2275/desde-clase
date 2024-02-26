package ajedrez;

public class Reina extends Pieza {
    public Reina(String color) {
        super(color);
    }

    public Reina() {

    }

    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        boolean aux=false;
        if (mov.esHorizontal()||mov.esDiagonal()||mov.esVertical())
            aux=true;
        return aux;
    }
}
