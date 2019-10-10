import java.util.Objects;

public class Casilla {

    private Ficha ficha;

    public Casilla() {
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void colocar(Ficha ficha) {
        assert ficha != null : "Error: la ficha a colocar en una casilla no puede ser nula";
        this.ficha = ficha;
    }

    public void vaciar() {
        this.ficha = null;
    }

    public boolean estaVacia() {
        return ficha==null;
    }

    @Override
    public boolean equals(Object o) {
        if (this.estaVacia())
            return false;
        if (this == o){
            return true;
        }
        if (o instanceof Casilla) {
            Casilla casilla = (Casilla) o;
            return ficha.equals(((Casilla) o).ficha);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ficha);
    }

    @Override
    public String toString() {
        return "|" + (estaVacia() ? " " : ficha) + "|";
    }


}