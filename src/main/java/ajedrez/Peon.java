package ajedrez;

public class Peon extends Pieza {
    public Peon(String color) {
        super(color);

    }

    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        boolean aux = false;
        if ((mov.posInicial.getFila() == 6 && getColor().equalsIgnoreCase("blanco")) && (mov.saltoVertical() == -2 || mov.saltoVertical() == -1)) {
            aux = true;
        } else if ((mov.posInicial.getFila() == 1 && getColor().equalsIgnoreCase("negro")) && (mov.saltoVertical() == 2 || mov.saltoVertical() == 1)) {
            aux = true;
        } else if ((getColor().equalsIgnoreCase("Blanco")) && (tablero.hayPieza(mov.posFinal)) && (mov.esDiagonal() && mov.saltoVertical() == -1)) {
            aux = true;
        } else if ((getColor().equalsIgnoreCase("Negro")) && (tablero.hayPieza(mov.posFinal)) && (mov.esDiagonal() & mov.saltoVertical() == 1)) {
            aux = true;
        } else if ((getColor().equalsIgnoreCase("blanco")) && (!tablero.hayPieza(mov.posFinal) )&& (mov.saltoVertical() == -1)) {
            aux = true;
        } else if ((getColor().equalsIgnoreCase("negro")) && (!tablero.hayPieza(mov.posFinal)) && (mov.saltoVertical() == 1)) {
            aux = true;
        }
        return aux;
    }
}

