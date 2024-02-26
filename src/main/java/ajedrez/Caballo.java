package ajedrez;

public class Caballo extends Pieza {
    public Caballo(String color) {
        super(color);
    }

    public Caballo() {

    }

    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        boolean respuesta = false;
        if ((Math.abs(mov.saltoHorizontal()) == 2 && Math.abs(mov.saltoVertical()) == 1) || (Math.abs(mov.saltoVertical()) == 2 && Math.abs(mov.saltoHorizontal()) == 1))
            respuesta = true;
        return respuesta;
    }
}
