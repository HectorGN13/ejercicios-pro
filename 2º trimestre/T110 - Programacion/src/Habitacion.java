import java.util.Arrays;

public class Habitacion {

    Persona[] ocupantes;

    public Habitacion(Persona[] ocupantes) {
        this.ocupantes = ocupantes;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "ocupantes=" + Arrays.toString(ocupantes) +
                '}';
    }
}
