public class Tablero {

    Pieza tablero[][];

    public Tablero() {
        tablero = new Pieza[8][8];

        tablero[0][0] = new Torre("Negro");
        tablero[0][1] = new Caballo("Negro");
        tablero[0][2] = new Alfil("Negro");
        tablero[0][3] = new Rey("Negro");
        tablero[0][4] = new Dama("Negro");
        tablero[0][5] = new Alfil("Negro");
        tablero[0][6] = new Caballo("Negro");
        tablero[0][7] = new Torre("Negro");
        for (int j = 0; j < tablero.length; j++) {
            tablero[1][j] = new Peon("Negro");
        }

        tablero[7][7] = new Torre("Blanco");
        tablero[7][6] = new Caballo("Blanco");
        tablero[7][5] = new Alfil("Blanco");
        tablero[7][4] = new Rey("Blanco");
        tablero[7][3] = new Dama("Blanco");
        tablero[7][2] = new Alfil("Blanco");
        tablero[7][1] = new Caballo("Blanco");
        tablero[7][0] = new Torre("Blanco");
        for (int j = 0; j < tablero.length; j++) {
            tablero[6][j] = new Peon("Blanco");
        }
    }

    public void pintarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if (tablero[i][j] != null) {
                    System.out.print(tablero[i][j] + " ");
                } else
                    System.out.print("[]" + " ");
            }
            System.out.println();
        }

    }
    public void  Mover (Movimiento mov){
        tablero[mov.posFinal.getFila()][mov.posFinal.getColumna()]=tablero[mov.posInicial.getFila()][mov.posInicial.getColumna()];
        tablero[mov.posInicial.getFila()][mov.posInicial.getColumna()]=null;

    }

    public boolean hayPieza(int filaInicial, int columnaInicial) {
        return tablero[filaInicial][columnaInicial] != null;
    }

    public boolean hayPieza(Posicion pos) {
        return hayPieza(pos.getFila(), pos.getColumna());
    }

    public boolean hayPiezaEntre(Movimiento mov){
        boolean aux = true;

        if (mov.esVertical()){
            int filaMenor;
            int filaMayor;
            if (mov.posInicial.getFila()>mov.posFinal.getFila()) {
                filaMayor = mov.posInicial.getFila();
                filaMenor = mov.posFinal.getFila();
            }else{
                filaMayor = mov.posFinal.getFila();
                filaMenor = mov.posInicial.getFila();
            }
            for (int i = filaMenor  ; filaMayor>filaMenor; i++) {
                hayPieza(filaMenor);
            }
        }
        return aux;
    }

    public void ponPieza(int filaInicial, int columnaInicial, Pieza figura) {
        tablero[filaInicial][columnaInicial] = figura;
    }

    public void ponPieza(Posicion pos, Pieza figura) {
        ponPieza(pos, figura);
    }

    public void quitaPieza(int fila, int columna) {
        tablero[fila][columna] = null;
    }

    public void quitarPieza(Posicion pos) {
        quitaPieza(pos.getFila(), pos.getColumna());
    }


    public Pieza damePieza(int filaInicial, int columnaInicial) {
        return tablero[filaInicial][columnaInicial];
    }
    public Pieza damePieza(Posicion pos){
        return damePieza(pos.getFila(), pos.getColumna());
    }


}
