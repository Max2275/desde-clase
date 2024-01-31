public class Rey extends Pieza {
    public Rey(String blanco) {
    }

    public Rey() {
    }

    public Rey(String color, String nombre) {
        super(color, nombre);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }
}
