import java.util.Random;

public class Juego {

    protected String elTurno;

    public Juego() {
        elTurno = "blanco";
    }

    public Movimiento validarJugada(String jugada, Tablero tablero) {
        Movimiento mov = null;
        //int filaInicial, fila
        int columnaInicial = jugada.charAt(0) - 65;
        int filaInicial = 7 - (jugada.charAt(1) - 49);
        int columnaFinal = jugada.charAt(2) - 65;
        int filaFinal = 7 - (jugada.charAt(3) - 49);

        //validaciones de la jugada

        if (jugada.length() != 4) {
            System.out.println("Error. La jugada tiene que tener 4 caracteres ejm: A2A3");
        } else if (filaInicial > 7 || filaInicial < 0) {
            System.out.println("Error. El primer caracter es erroneo. Debe ser una letra entre A y H para indicar en que fila está.");
        } else if (filaFinal > 7 || filaFinal < 0) {
            System.out.println("Error. El tercer caracter es erroneo. Debe ser una letra entre A y H para indicar a que fila va.");
        } else if (columnaInicial > 7 || columnaInicial < 0) {
            System.out.println("Error. El segundo caracter es erroneo. Debe ser un numero entre 1 y 8 para indicar en que columna está.");
        } else if (columnaFinal > 7 || columnaFinal < 0) {
            System.out.println("Error. El cuarto caracter es erroneo. Debe ser un numero entre 1 y 8 para indicar a que columna va.");
        } else if (!tablero.hayPieza(filaInicial, columnaInicial)) {
            System.out.println("Error. No hay pieza en la pos inicial");
        } else if (!tablero.damePieza(filaInicial, columnaInicial).getColor().equalsIgnoreCase(elTurno)) {
            System.out.println("Error. No puedes mover las piezas del contrario");
        } else if ((tablero.hayPieza(filaFinal, columnaFinal)) && (tablero.damePieza(filaFinal, columnaFinal).getColor().equalsIgnoreCase(elTurno))) {
            System.out.println("Error. No puedes comerte tu propia pieza.");

        } else {
            mov = new Movimiento(new Posicion(filaInicial, columnaInicial), new Posicion(filaFinal, columnaFinal));
        }
        return mov;
    }

    public void cambiarTurno() {
        if (elTurno.equalsIgnoreCase("blanco")) {
            elTurno = "negro";
        } else {
            elTurno = "blanco";
        }
    }
}




