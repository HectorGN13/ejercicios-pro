public class Principal {

    public static void main(String[] args) {

        Lista lst = new Lista();

        Nodo n1 = new Nodo(2);
        Nodo n2 = new Nodo(4);
        Nodo n3 = new Nodo(6);
        Nodo n4 = new Nodo(8);

        lst.insertar(n1);                                                   // Inserta un nodo al principio de la lista
        lst.agregar(n2);                                                    // Agrega al final de la lista
        lst.agregar(n3);                                                    // Agrega al final de la lista
        lst.agregar(n4);                                                    // Agrega al final de la lista
        System.out.println(lst.insertarAntes(new Nodo(1),n1));        // Insertar un nuevo nodo delante
        System.out.println(lst.insertarDespues(new Nodo(3), n1));     // Inserta un nuevo nodo despues de n1
        lst.agregar(2);
        lst.agregar(2);
        lst.agregar(2);
        System.out.println(lst.contar(new Nodo(2)));
        //System.out.println(lst.borrar(new Nodo(1)));                  // Borra un nodo
        //lst.borrar();
        System.out.println(lst.getPosicion(n4));

        mostrarLista(lst);

    }

    private static void mostrarLista(Lista l) {

        if (l.estaVacia())
            System.out.println("Lista vacía");
        else
            for (Nodo aux = l.getInicio() ; aux != null; aux = aux.getSiguiente())
                System.out.print(aux+" ");

    }
}
