public class Peon extends Pieza {
    public Peon(String color) {
        super(color);

    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }
}

