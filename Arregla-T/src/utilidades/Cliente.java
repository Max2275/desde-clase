package utilidades;

public class Cliente {
    private String nombre;
    private String apellidos;
    private int tfno;
    private int id;

    public Cliente(String nombre, String apellidos, int tfno, int id) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tfno = tfno;
        this.id = id;
    }
    public Cliente (){
        nombre="Lucía";
        apellidos="Rojas Delgado";
        tfno= 665317401;
        id= 55547;
    }
}
