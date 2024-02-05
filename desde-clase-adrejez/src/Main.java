import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        Tablero tablero = new Tablero();
        Juego juego = new Juego();
        tablero.pintarTablero();
        String jugada = lector.nextLine();//pedir al usuario
        Movimiento mov = juego.validarJugada(jugada.toUpperCase(), tablero);
        // tablero la pieza de la posición inicial de este mov puede moverse así?
        //mover
        //cambiar turno
        if (mov!= null&&tablero.damePieza(mov.posInicial).validoMovimiento(mov)) {
            tablero.Mover(mov);
            tablero.pintarTablero();
        }
    }
}