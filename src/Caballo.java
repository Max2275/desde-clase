public class Caballo extends Pieza {
    public Caballo(String blanco) {

    }

    public Caballo() {
    }

    public Caballo(String color, String nombre) {
        super(color, nombre);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return false;
    }
}
