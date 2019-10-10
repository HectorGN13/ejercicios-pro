import java.util.Objects;

public class Alumno implements Comparable<Alumno>{

    private String Alias;

    public Alumno(String alias) {
        Alias = alias;
    }

    public String getAlias() {
        return Alias;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Alumno)) return false;
        Alumno alumno = (Alumno) o;
        return Alias.equals(alumno.getAlias());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAlias());
    }

    @Override
    public String toString() {
        return Alias + "@" + hashCode();
    }

    @Override
    public int compareTo(Alumno o) {
        return getAlias().compareTo(o.getAlias());
    }
}
