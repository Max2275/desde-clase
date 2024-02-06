public class Caballo extends Pieza {
    public Caballo(String color) {
        super(color);

    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        boolean respuesta = false;
        if ((Math.abs(mov.saltoHorizontal()) == 2 && Math.abs(mov.saltoVertical()) == 1) || (Math.abs(mov.saltoVertical()) == 2 && Math.abs(mov.saltoHorizontal()) == 1))
            respuesta = true;
        return respuesta;
    }
}
