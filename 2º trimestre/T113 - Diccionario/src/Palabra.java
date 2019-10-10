import java.util.Objects;

public class Palabra implements Comparable<Palabra> {

    private String expUk;
    private String expEsp;


    public Palabra(String expUk, String expEsp) {
       setExpEsp(expEsp);
       setExpUk(expUk);
    }

    public void setExpUk(String expUk) {
        assert expUk.length() > 0 : "Error: la palabra no puede estar vacia";
        assert expUk != null : "Error: la palabra no puede ser null";
        this.expUk = expUk;
    }

    public void setExpEsp(String expEsp) {
        assert expEsp.length() > 0 : "Error: la palabra no puede estar vacia";
        assert expEsp != null : "Error la palabra no puede ser null";
        this.expEsp = expEsp;
    }


    public String getExpUk() {
        return expUk;
    }

    public String getExpEsp() {
        return expEsp;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Palabra palabra = (Palabra) o;
        return Objects.equals(expUk, palabra.expUk) &&
                Objects.equals(expEsp, palabra.expEsp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(expUk, expEsp);
    }

    @Override
    public String toString() {
        return "Ingles: " + expUk + ". ===> " + "Español: " + expEsp + ".";
    }


    @Override
    public int compareTo(Palabra o) {
        return this.expUk.compareTo(o.expUk);
    }
}
