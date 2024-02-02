// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Tablero tablero = new Tablero();
        Juego juego = new Juego();
        tablero.pintarTablero();
        String jugada = "A2A3";
        Movimiento mov = juego.validarJugada(jugada);
        if (mov!= null) {
            // tablero la pieza de la posición inicial de este mov puede moverse así?
            //mover
            //pintarTablero
            //cambiar turno
        }
    }
}