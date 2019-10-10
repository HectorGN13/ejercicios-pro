import java.util.Objects;
import java.util.Random;

public class Persona {

    private String alias;

    public Persona(String alias) {
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Estamos ejecutando el equals");
        if (this == o) return true;
        if (!(o instanceof Persona)) return false;
        Persona persona = (Persona) o;
        return alias.equals(persona.getAlias());
        //return false;
    }

    @Override
    public int hashCode() {
        System.out.println("Estamos ejecutando el HashCode");
        //return Objects.hash(alias);
        return 1;
    }
}
