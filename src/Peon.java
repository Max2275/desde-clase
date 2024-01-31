public class Peon extends Pieza {
    public Peon(String blanco) {
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }

    public Peon() {
    }

    public Peon(String color, String nombre) {
        super(color, nombre);
    }
}
