/*
E: elemento de una colección.
K: clave.
N: número.
T: tipo.
V: valor.
S, U, V etc: para segundos, terceros y cuartos tipos.
*/


public class Nodo<E extends Comparable> implements Comparable<E> {


    private E elemento;

    public Nodo(E elemento) {
        this.elemento = elemento;
    }

    @Override
    public int compareTo(E o) {
        return elemento.compareTo(o);
    }

    @Override
    public String toString() {
        return elemento.toString();
    }
}
