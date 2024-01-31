public class Tablero {

    Pieza tablero[][];
    public Tablero() {
        tablero = new Pieza[8][8];
        tablero[0][0] = new Torre("Blanco");
        tablero[0][1] = new Caballo("Blanco");
        tablero[0][2] = new Alfil("Blanco");
        tablero[0][3] = new Rey("Blanco");
        tablero[0][4] = new Reina("Blanco");
        tablero[0][5] = new Alfil("Blanco");
        tablero[0][6] = new Caballo("Blanco");
        tablero[0][7] = new Torre("Blanco");
        for (int j = 0; j < tablero.length; j++) {
            tablero[1][j] = new Peon("Blanco");
        }
        tablero[7][7] = new Torre("Blanco");
        tablero[7][6] = new Caballo("Blanco");
        tablero[7][5] = new Alfil("Blanco");
        tablero[7][4] = new Rey("Blanco");
        tablero[7][3] = new Reina("Blanco");
        tablero[7][2] = new Alfil("Blanco");
        tablero[7][1] = new Caballo("Blanco");
        tablero[7][0] = new Torre("Blanco");
        for (int j = 0; j < tablero.length; j++) {
            tablero[1][j] = new Peon("Blanco");
        }
    }
        public void pintarTablero(){
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero.length; j++) {
                    System.out.print(tablero[i][j]);
                }
            }
            System.out.println();
        }








}
