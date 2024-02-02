public class Dama extends Pieza {
    public Dama(String color) {
        super(color);

    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }
}
