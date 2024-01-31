public class Torre extends Pieza {

    public Torre(String color) {
        super(color);

    }
    @Override
    public boolean validoMovimiento(Movimiento mov) {
        boolean aux=false;
        if (mov.esHorizontal()||mov.esVertical())
            aux=true;
        return aux;
    }


}
