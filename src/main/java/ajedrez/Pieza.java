package ajedrez;

public abstract class Pieza {

    private String color;
    protected String nombre;
    public Pieza(){
        nombre=this.getClass().getSimpleName();
        color="Blanco";
    }
    public Pieza(String color) {
        nombre=getClass().getSimpleName();
        this.color = color;

    }

    public abstract boolean validoMovimiento(Movimiento mov,Tablero tablero);

    public String getColor() {
        return color;
    }
    public String toString() {
        return Character.toString(nombre.charAt(0)) +(color.charAt(0));
    }
}
