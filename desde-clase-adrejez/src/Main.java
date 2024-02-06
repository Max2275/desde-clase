import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        Tablero tablero = new Tablero();
        Juego juego = new Juego();
        tablero.pintarTablero();
        // tablero la pieza de la posición inicial de este mov puede moverse así?
        //mover
        //cambiar turno
        boolean aux=true;
        do {
            System.out.println("Es el turno de " + juego.elTurno + ". Introduce una jugada del tipo A1A2" );
            String jugada = lector.nextLine();//pedir al usuario

            aux=false;
            Movimiento mov = juego.validarJugada(jugada.toUpperCase(),tablero);
            if (mov != null && tablero.damePieza(mov.posInicial).validoMovimiento(mov)) {
                tablero.Mover(mov);
            } else if (mov!=null) {
                System.out.println("Error.No se puede realizar este movimiento.");
            }
            juego.cambiarTurno();
            tablero.pintarTablero();

        }while(true);

    }
}