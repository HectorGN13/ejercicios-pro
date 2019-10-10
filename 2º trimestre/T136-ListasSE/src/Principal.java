import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        ListaSE li = new ListaSE();
        li.agregar(new Nodo(1));
        li.agregar(new Nodo(3));
        li.agregar(new Nodo(5));
        li.agregar(new Nodo(7));

        System.out.println(li);
        System.out.println(li.get(2));
        li.insertar(new Nodo(20));
        System.out.println(li);
    }

    private static void mostrarLista(ListaSE ls) {
        // Mostrar lista
        if (ls.estaVacia())
            System.out.println("Lista vacía");
        else
            for (Nodo aux = ls.getInicio(); aux != null; aux = aux.getNodoSiguiente())
                System.out.print(aux+" ");
    }
}
