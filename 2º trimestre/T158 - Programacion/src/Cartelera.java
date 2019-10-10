import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Cartelera {

    private HashMap<Pelicula, Reparto> peliculasDisponibles;

    public Cartelera() {
        peliculasDisponibles = new HashMap<>();
    }

    public Cartelera(HashMap<Pelicula, Reparto> peliculasDisponibles) {
        this.peliculasDisponibles = peliculasDisponibles;
    }

    public void setPeliculasDisponibles(HashMap<Pelicula, Reparto> peliculasDisponibles) {
        this.peliculasDisponibles = peliculasDisponibles;
    }

    public void agregarPelicula(Pelicula pelicula, Reparto reparto){
        peliculasDisponibles.put(pelicula,reparto);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Iterator it = peliculasDisponibles.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry e = (Map.Entry)it.next();
            result.append("Pelicula: ").append(e.getKey().toString()).append(" ").append("Reparto: ").append(e.getValue().toString()).append("\n");
        }
        return result.toString();
    }
}
