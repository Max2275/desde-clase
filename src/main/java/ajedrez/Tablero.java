package ajedrez;

import java.util.Scanner;

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
                } else System.out.print("[]" + " ");
            }
            System.out.println();
        }

    }

    public void Mover(Movimiento mov) {
        tablero[mov.posFinal.getFila()][mov.posFinal.getColumna()] = tablero[mov.posInicial.getFila()][mov.posInicial.getColumna()];
        tablero[mov.posInicial.getFila()][mov.posInicial.getColumna()] = null;

    }

    public boolean hayPieza(int filaInicial, int columnaInicial) {
        return tablero[filaInicial][columnaInicial] != null;
    }

    public boolean hayPieza(Posicion pos) {
        return hayPieza(pos.getFila(), pos.getColumna());
    }

    public boolean hayPiezaEntre(Movimiento mov) {
        boolean aux = false;
        if (damePieza(mov.posInicial.getFila(), mov.posInicial.getColumna()).getClass().getSimpleName().equalsIgnoreCase("Caballo")) {
            if (mov.esVertical()) {

                if (mov.posInicial.getFila() < mov.posFinal.getFila()) {
                    for (int i = mov.posInicial.getFila() + 1; i < mov.posFinal.getFila(); i++) {
                        if (hayPieza(i, mov.posInicial.getColumna())) aux = true;
                    }
                } else if (mov.posInicial.getFila() > mov.posFinal.getFila()) {
                    for (int i = mov.posInicial.getFila() - 1; i > mov.posFinal.getFila(); i--) {
                        if (hayPieza(i, mov.posInicial.getColumna())) aux = true;
                    }
                }
            }
            if (mov.esHorizontal()) {
                if (mov.posInicial.getColumna() < mov.posFinal.getColumna()) {
                    for (int i = mov.posInicial.getColumna() + 1; i < mov.posFinal.getColumna(); i++) {
                        if (hayPieza(i, mov.posInicial.getFila())) aux = true;
                    }
                } else if (mov.posInicial.getColumna() > mov.posFinal.getColumna())
                    for (int i = mov.posInicial.getColumna() - 1; i > mov.posFinal.getColumna(); i--) {
                        if (hayPieza(i, mov.posInicial.getFila())) aux = true;
                    }
            }
            if (mov.esDiagonal()) {
                if (mov.posInicial.getFila() < mov.posFinal.getFila() && mov.posInicial.getColumna() < mov.posFinal.getColumna()) {
                    for (int i = mov.posInicial.getFila() + 1, j = mov.posInicial.getColumna() + 1; i < mov.posFinal.getFila(); i++, j++) {
                        if (hayPieza(i, j)) aux = true;
                    }


                } else if (mov.posInicial.getFila() > mov.posFinal.getFila() && mov.posInicial.getColumna() > mov.posFinal.getColumna()) {
                    for (int i = mov.posInicial.getFila() - 1, j = mov.posInicial.getColumna() - 1; i < mov.posFinal.getFila(); i--, j--) {
                        if (hayPieza(i, j)) aux = true;
                    }

                } else if (mov.posInicial.getFila() > mov.posFinal.getFila() && mov.posInicial.getColumna() < mov.posFinal.getColumna()) {
                    for (int i = mov.posInicial.getFila() - 1, j = mov.posInicial.getColumna() + 1; i > mov.posFinal.getFila(); i--, j++) {
                        if (hayPieza(i, j)) aux = true;
                    }
                } else if (mov.posInicial.getFila() < mov.posFinal.getFila() && mov.posInicial.getColumna() > mov.posFinal.getColumna()) {
                    for (int i = mov.posInicial.getFila() + 1, j = mov.posInicial.getColumna() - 1; i < mov.posFinal.getFila(); i++, j--) {
                        if (hayPieza(i, j)) aux = true;
                    }
                }
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

    public Pieza damePieza(Posicion pos) {
        return damePieza(pos.getFila(), pos.getColumna());
    }
    public boolean puedeProm(Movimiento mov){
        boolean aux=false;
        if (damePieza(mov.posInicial.getFila(),mov.posInicial.getColumna()).getClass().getSimpleName().equalsIgnoreCase("Peon") && mov.posFinal.getFila()==0 && damePieza(mov.posInicial.getFila(),mov.posInicial.getColumna()).getColor().equalsIgnoreCase("Blanco") ) {
            aux = true;
        }else if (damePieza(mov.posInicial.getFila(),mov.posInicial.getColumna()).getClass().getSimpleName().equalsIgnoreCase("Peon") && mov.posFinal.getFila()==7 && damePieza(mov.posInicial.getFila(),mov.posInicial.getColumna()).getColor().equalsIgnoreCase("negro") ){
            aux=true;
        }
        return aux;
    }
    public void promocionar(Movimiento mov){
        Scanner lector = new Scanner(System.in);
        int opcion;
        if (puedeProm(mov)){
            System.out.println("Tu peon puede promocionar, eliga una opción numérica");
            System.out.println("1. Dama");
            System.out.println("2. Alfil");
            System.out.println("3. Caballo");
            System.out.println("4. Torre");
            opcion= lector.nextInt();
            switch (opcion) {
                case 1:{
                    Pieza pieza =damePieza(mov.posInicial.getColumna(),mov.posInicial.getFila()) ;
                    pieza = new Dama();
                    break;
            }
                case 2: {
                    Pieza pieza = new Alfil();
                    break;
                }
                case 3:{
                    Pieza pieza = new Caballo();
                    break;
                }
                case 4:{
                    Pieza pieza = new Torre();
                    break;
                }
            }
        }
    }

}
