import java.util.Objects;

public class Nodo {

    private int entero;
    private Nodo siguienteNodo; //!= this <<R>>

    public Nodo(int entero) {
        this.entero = entero;
    }

    public void setSiguienteNodo(Nodo siguienteNodo) {
        this.siguienteNodo = siguienteNodo;
    }

    public int getEntero() {
        return entero;
    }

    public Nodo getSiguienteNodo() {
        return siguienteNodo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nodo nodo = (Nodo) o;
        return entero == nodo.entero &&
                Objects.equals(siguienteNodo, nodo.siguienteNodo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entero, siguienteNodo);
    }
}
