import java.util.Objects;

public class Nodo {
    private int numero;
    private Nodo nodoSiguiente;

    public Nodo(int numero) {
        this.numero = numero;
        nodoSiguiente = null;
    }

    public void setNodoSiguiente(Nodo nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }

    /**
     * Obtener el nodoSiguiente nodo
     * @return Referencia al nodoSiguiente nodo
     */
    public Nodo getNodoSiguiente() {
        return nodoSiguiente;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nodo nodo = (Nodo) o;
        return numero == nodo.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return Integer.toString(numero);
    }


}
