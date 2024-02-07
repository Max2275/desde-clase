public class Dama extends Pieza {
    public Dama(String color) {
        super(color);

    }

    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        boolean aux=false;
        if (mov.esHorizontal()||mov.esDiagonal()||mov.esVertical())
            aux=true;
        return aux;
    }
}
