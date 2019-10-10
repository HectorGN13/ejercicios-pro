/**
 * Lista simplemente enlazada
 */
public class ListaSE {
    private Nodo inicio;
    private static int longitud;

    public ListaSE() {
        inicio = null;
    }

    /**
     * Metodo que devulve el nodo de inicio
     * @return el nodo de inicio
     */

    public Nodo getInicio() {
        return inicio;
    }

    /**
     * Lista vacía
     * @return true (si la lista está vacía)
     */
    public boolean estaVacia() {
        return inicio==null;
    }



    /**
     * Agrega un nuevo nodo al final de la lista
     * @param nuevo Nuevo nodo
     */
    public void agregar(Nodo nuevo) {

        // Lista vacía
        if (estaVacia()) {
            inicio = nuevo;
            ++longitud;
            return;
        }

        // Recorrido de la lista
        Nodo aux = inicio;
        while (aux.getNodoSiguiente() != null)
            aux = aux.getNodoSiguiente();

        // aux apunta al último nodo
        aux.setNodoSiguiente(nuevo);
        ++longitud;
    }

    /**
     * Metodo que inserta un nodo al principio de la lista
     * @param nuevo es el Nodo nuevo a insertar
     */
    public void insertar(Nodo nuevo) {
        assert nuevo != null : "Error: el nodo a insertar no puede ser nulo";

        if (estaVacia()){
            inicio = nuevo;
            ++longitud;
        }

        Nodo aux = inicio;
        inicio = nuevo;
        inicio.setNodoSiguiente(aux);
        ++longitud;

    }

    /**
     * Metodo que inserta un nodo nuevo delante de otro nodo
     * @param nuevo es el nuevo nodo a insertar
     * @param sucesor es el nodo que sucede al nuevo
     */

    public void insertarAntes(Nodo nuevo, Nodo sucesor) {

        assert estaEnLista(sucesor) : "Error: el nodo sucesor no está en la lista ";

        if (sucesor.equals(inicio))             // Si el nodo sucesor es el primero invoco el metodo insertar()
            insertar(nuevo);

        // TODO: 17/02/2019 TERMINAR

        /*for (Nodo aux = inicio; aux != null; aux = aux.getNodoSiguiente()) {

            if (aux.getNodoSiguiente() == null)
                return;

            if (aux.getNodoSiguiente().equals(sucesor)) {

                aux.setNodoSiguiente(nuevo);
                nuevo.setNodoSiguiente(sucesor);
            }

        }*/
    }

    /**
     * Metodo que busca un nodo en la lista
     * @param sucesor es el nodo a buscar
     * @return true si el nodo está en la lista o false si no está.
     */

    private boolean estaEnLista(Nodo sucesor) {

        if (estaVacia())
            return false;

        for (Nodo aux = inicio; aux != null; aux = aux.getNodoSiguiente())
            if (aux.equals(sucesor))
                return true;
        return false;
    }

    /**
     * Devuelve el nodo que está el la posición recibida
     * Requiere: que la lista no esté vacía
     *
     * @param posicion  Posición del elemento [0,longitud-1]
     *                  longitud = Nº de nodos de la lista
     * @return          Nodo de la posición recibida
     */
    public Nodo get(int posicion) {
        assert posicion >= 0 : "La posición debe ser >= 0";
        assert posicion <= getLongitud():"Error: la posicion recibida tiene que ser menor o igual la longitud de la lista";
        assert !estaVacia() : "La lista esta vacía";

        Nodo aux = inicio;      // Primer nodo (posición 0)

        for (int i = 0; i < longitud-1 && i < posicion ; i++) {
            aux = aux.getNodoSiguiente();
        }

        return aux;
    }

    public static int getLongitud() {
        return longitud;
    }

    // TODO: 17/02/2019 TERMINAR
    public boolean insertarDespues(Nodo nuevo, Nodo precesor) {
        assert estaEnLista(precesor) : "Error: el nodo que sucede al nuevo no se encuentra en la lista";
        return false;
    }

   /* public ListaSE filtrar(Nodo nodo) {
        assert nodo != null : "El nodo para filtrar no puede ser nulo";

        ListaSE nueva = new ListaSE();

        if (estaVacia())
            return nueva;

        int contador = contar(nodo);
        for (int i = 0; i < contador ; i++) {

        }

    }*/


    @Override
    public String toString() {
        if (estaVacia())
            return "";

        String texto = "";
        Nodo aux = inicio;
        while (aux.getNodoSiguiente() != null) {
            texto += aux + " ";
            aux = aux.getNodoSiguiente();
        }

        return texto+aux;
    }
}
