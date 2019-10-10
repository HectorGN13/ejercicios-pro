import java.util.Objects;

public class Personaje {

    private String alias;

    public Personaje(String alias) {
        setAlias(alias);
    }

    private void setAlias(String alias) {
        assert alias != null : "Error el alias no puede ser nulo";
        this.alias = alias;
    }

    public String getAlias() {
        return alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personaje)) return false;
        Personaje personaje = (Personaje) o;
        return getAlias().equals(personaje.getAlias());
    }

    @Override
    public int hashCode() {
        return Objects.hash(alias);
    }
}
