package P2;

import java.util.Random;

public class Profesor {
    public static void ponerNotas(Alumno alumno){
        Random random = new Random();
        alumno.getLengua().setCalificación(random.nextDouble(0,10));
        alumno.getMatematicas().setCalificación(random.nextDouble(0,10));
        alumno.getHistoria().setCalificación(random.nextDouble(0,10));
        }

}
