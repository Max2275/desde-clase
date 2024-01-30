import utilidades.Cliente;
public class Parche extends Arreglos{
    private double tamanio;
    private String tipo;
    public Parche(double precio, Cliente cliente,String tipo, double tamanio) {
        super(precio, cliente);
        this.tamanio=tamanio;
        this.tipo=tipo;
    }

}
