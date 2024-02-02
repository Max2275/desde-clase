public class Juego {
    private String elTurno;

    public Movimiento validarJugada(String jugada){
        Movimiento mov = null;
        int filaInicial=jugada.charAt(0)-65;
        int columnaInicial=jugada.charAt(1)-49;
        int filaFinal=jugada.charAt(2)-65;
        int columnaFinal=jugada.charAt(3)-49;
        if (jugada.length()!=4)
            System.out.println("Error. La jugada tiene que tener 4 caracteres ejm: A2A3");
        else if(filaInicial>=65&&) {
            //int filaInicial, fila
            //validaciones de la jugada
        }
        else { //ole que ya tenemos movimiento

            //mov= new Movimiento(new Posicion(filaInicial,columnaInicial), );
        }
        return mov;
    }
}
