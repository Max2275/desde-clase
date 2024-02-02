public class Alfil extends Pieza {
    public Alfil(String color) {
        super(color);
    }
    @Override
    public boolean validoMovimiento(Movimiento mov) {
        boolean aux=false;
        if (mov.esDiagonal())
            aux=true;
        return aux;
    }
}
