package ajedrez;

public class Dama extends Pieza {
    public Dama(String color) {
        super(color);
        nombre=getColor().equalsIgnoreCase("negro")?"File:src/main/java/resources/com/example/Ej3GridImageView/imagenes/ReinaNegra.png":"File:src/main/java/resources/com/example/Ej3GridImageView/imagenes/ReinaBlanca.png";
    }

    public Dama() {

    }

    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        boolean aux=false;
        if (mov.esHorizontal()||mov.esDiagonal()||mov.esVertical())
            aux=true;
        return aux;
    }
}
