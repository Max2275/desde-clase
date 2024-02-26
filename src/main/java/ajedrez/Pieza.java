package ajedrez;

public abstract class Pieza {
    protected String color;
    protected String nombre;
    protected String rutaImagen;
    public Pieza(){
        nombre=this.getClass().getSimpleName();
        color="Blanco";
    }
    public Pieza(String color) {
        nombre=getClass().getSimpleName();
        this.color = color;
        rutaImagen= "File:src/main/resources/com/example/ej3gridimageview/imagenes/" + getClass().getSimpleName() + String.valueOf(color.charAt(0)).toUpperCase() + color.substring(1) + ".png";
    }



    public String getRutaImagen() {
        return rutaImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract boolean validoMovimiento(Movimiento mov, Tablero tablero);

    public String getColor() {
        return color;
    }
    public String toString() {

        return Character.toString(nombre.charAt(0)) +(color.charAt(0));
    }
}
