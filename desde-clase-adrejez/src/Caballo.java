public class Caballo extends Pieza {
    public Caballo(String color) {
        super(color);

    }
    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }
}
