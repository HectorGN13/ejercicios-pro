public class ListaSE {

     private Nodo inicio;


    public ListaSE() {

    }

    public void setInicio(Nodo inicio) {
        assert inicio != null : "Error no se puede agregar un nodo que sea null";
        this.inicio = inicio;
    }

    public void agregar(Nodo nuevoNodo){
        assert nuevoNodo != null : "Error: no se puede agregar un null, debes agregar un nodo";

        Nodo aux = inicio;
        if(inicio != null){

            while (aux.getSiguienteNodo() != null ) {
                aux = aux.getSiguienteNodo();
            }
            aux.setSiguienteNodo(nuevoNodo);
        } else {
            inicio = nuevoNodo;
        }
    }

    public void agregar(int entero){
        agregar(new Nodo(entero));
    }

    public void insertar(Nodo nuevo){
        assert nuevo != null : "Error: no puede insertar un nulo, tienes que insertar un nodo";

        if(inicio != null){
        Nodo aux = inicio;
        inicio = nuevo;
        nuevo.setSiguienteNodo(aux);
        } else {
            inicio = nuevo;
        }
    }

    public void insertarAntes(Nodo nuevo, Nodo nodoAlqueInsertar){

    }

    public boolean buscar(Nodo nodo){
        boolean result = false;
        while

        return result;
    }
}
