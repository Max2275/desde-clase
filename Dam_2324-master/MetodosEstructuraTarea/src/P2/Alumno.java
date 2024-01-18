package P2;

public class Alumno {

    private Asignatura Lengua;
    private Asignatura Matematicas;
    private Asignatura Historia;

    public Alumno (Asignatura lengua, Asignatura matematicas, Asignatura historia){
        this.Lengua=lengua;
        this.Matematicas=matematicas;
        this.Historia=historia;
    }
    public Alumno(int x, int y, int z){
        this.Lengua=new Asignatura(x);
        this.Matematicas=new Asignatura(y);
        this.Historia=new Asignatura(z);
    }

    public Asignatura getLengua() {
        return Lengua;
    }

    public Asignatura getMatematicas() {
        return Matematicas;
    }

    public Asignatura getHistoria() {
        return Historia;
    }
}
