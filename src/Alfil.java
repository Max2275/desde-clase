public class Alfil extends Pieza {

    public Alfil() {
    }

    public Alfil(String color, String nombre) {
        super(color, nombre);
    }

    public Alfil(String color) {
        super(color);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }
}
