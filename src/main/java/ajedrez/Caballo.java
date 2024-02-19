package ajedrez;

public class Caballo extends Pieza {
    public Caballo(String color) {
        super(color);
        nombre=getColor().equalsIgnoreCase("negro")?"File:src/main/java/resources/com/example/Ej3GridImageView/imagenes/CaballoNegro.png":"File:src/main/java/resources/com/example/Ej3GridImageView/imagenes/CaballoBlanco.png";
    }

    public Caballo() {

    }

    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        boolean respuesta = false;
        if ((Math.abs(mov.saltoHorizontal()) == 2 && Math.abs(mov.saltoVertical()) == 1) || (Math.abs(mov.saltoVertical()) == 2 && Math.abs(mov.saltoHorizontal()) == 1))
            respuesta = true;
        return respuesta;
    }
}
