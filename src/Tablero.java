public class Tablero {

    Pieza tablero[][];

    public Tablero() {
        tablero = new Pieza[8][8];

        tablero[0][0] = new Torre("Blanco");
        tablero[0][1] = new Caballo("Blanco");
        tablero[0][2] = new Alfil("Blanco");
        tablero[0][3] = new Rey("Blanco");
        tablero[0][4] = new Dama("Blanco");
        tablero[0][5] = new Alfil("Blanco");
        tablero[0][6] = new Caballo("Blanco");
        tablero[0][7] = new Torre("Blanco");
        for (int j = 0; j < tablero.length; j++) {
            tablero[1][j] = new Peon("Blanco");
        }

        tablero[7][7] = new Torre("Negro");
        tablero[7][6] = new Caballo("Negro");
        tablero[7][5] = new Alfil("Negro");
        tablero[7][4] = new Rey("Negro");
        tablero[7][3] = new Dama("Negro");
        tablero[7][2] = new Alfil("Negro");
        tablero[7][1] = new Caballo("Negro");
        tablero[7][0] = new Torre("Negro");
        for (int j = 0; j < tablero.length; j++) {
            tablero[6][j] = new Peon("Negro");
        }
    }

    public void pintarTablero() {
        for (int i = 0; i < tablero.length;i++) {
            for (int j = 0; j < tablero.length;j++) {
                if (tablero[i][j] != null) {
                    System.out.print(tablero[i][j]+" ");
                }else
                    System.out.print("[]" + " ");
            }
            System.out.println();
        }

    }


}
