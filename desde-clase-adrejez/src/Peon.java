public class Peon extends Pieza {
    public Peon(String color) {
        super(color);

    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        boolean  aux = true;
        if ((mov.posInicial.getFila()==1 && getColor().equalsIgnoreCase("Blanco") || mov.posInicial.getFila()== 6 && getColor().equalsIgnoreCase("negro") )&& mov.saltoVertical()==2)
            aux=false;
        else if (mov.saltoVertical()==1) {
            aux=true;
        }
        return aux;
    }
}

