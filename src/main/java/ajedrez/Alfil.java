package ajedrez;

public class Alfil extends Pieza {
    public Alfil(String color) {
        super(color);
        nombre = getColor().equalsIgnoreCase("negro")?"File:src/main/resources/com/example/ej3gridimageview/imagenes/AlfilNegro.png":"File:src/main/resources/com/example/ej3gridimageview/imagenes/AlfilBlanco.png";
    }


    public Alfil() {

    }

    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        boolean aux=false;
        if (mov.esDiagonal())
            aux=true;
        return aux;
    }
    /*public String toString(){
        return getColor().equalsIgnoreCase("negro")?"File:src/main/resources/com/example/ej3gridimageview/imagenes/AlfilNegro.png":"File:src/main/resources/com/example/ej3gridimageview/imagenes/AlfilBlanco.png";
    }*/
}
