import utilidades.Cliente;

public abstract class Arreglos {
    protected double precio;
    protected Cliente cliente;

    public Arreglos(double precio, Cliente cliente) {
        this.precio = precio;
        this.cliente = cliente;
    }

    public Arreglos (){
        cliente=new Cliente("as","as",12313,134);

    }
}
