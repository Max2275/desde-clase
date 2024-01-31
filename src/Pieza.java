public abstract class Pieza {

    private String color;
    private String nombre;
    public Pieza(){
        nombre=this.getClass().getSimpleName();
        color="Blanco";
    }
    public Pieza(String color,String nombre) {
        this.nombre=getClass().getSimpleName();
        this.color = color;
    }

    public Pieza (String color){

    }
    public abstract boolean validoMovimiento(Movimiento mov);

    public String getColor() {
        return color;
    }
    public String toString() {
        return Character.toString(nombre.charAt(0)) +(color.charAt(0));
    }
}
