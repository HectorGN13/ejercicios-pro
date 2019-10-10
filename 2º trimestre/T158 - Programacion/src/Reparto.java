import java.util.Arrays;
import java.util.LinkedList;

public class Reparto {

    private LinkedList<Persona> actores;

    public Reparto(LinkedList<Persona> actores) {
        this.actores = actores;
    }

    public void setActores(LinkedList<Persona> actores) {
        this.actores = actores;
    }

    public LinkedList<Persona> getActores() {
        return actores;
    }

    @Override
    public String toString() {
        return "Actores=" + Arrays.toString(actores.toArray());
    }
}
