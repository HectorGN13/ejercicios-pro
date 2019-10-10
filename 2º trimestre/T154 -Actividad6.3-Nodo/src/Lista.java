public class Lista {
    private Nodo inicio;

    public Lista() {}

    public Nodo getInicio() {
        return inicio;
    }

    /**
     * Metodo para agregar un nodo al final de la lista
     * @param n
     */
    public void agregar(Nodo n) {
        Nodo aux = inicio;
        while (aux != null) {
            if (aux.getSiguiente()==null)
                break;
            else
                aux = aux.getSiguiente();
        }

        if (aux==null)          // Lista vacia
            inicio = n;         // Añado el nodo como único nodo de la lista

        else                    // Añado el nodo al final de la lista
            aux.setSiguiente(n);
    }

    /**
     * Metodo que añade un nodo al final de la lista
     * @param valor  es el valor que recibe el objeto Nodo
     */
    public void agregar(int valor) {
        Nodo n = new Nodo(valor);
        Nodo aux = inicio;

        while (aux != null) {
            if (aux.getSiguiente()==null)
                break;
            else
                aux = aux.getSiguiente();
        }

        if (aux==null)                                     // Lista vacia
            inicio = n;                                    // Añado el nodo como único nodo de la lista

        else                                               // Añado el nodo al final de la lista
            aux.setSiguiente(n);
    }

    /**
     * Añade un Nodo al principio de la lista
     * @param valor es el valor que recibe el nuevo nodo
     */

    public void insertar(int valor){
        Nodo n = new Nodo(valor);
        if (estaVacia()) {
            inicio = n;                                   // si está vacía añado el nodo como único nodo de la lista
        } else{
            n.setSiguiente(inicio);                       // añado el nodo a lista
            inicio = n;                                   // añado el  nuevo nodo como el inicio de la lista.
        }

    }

    /**
     * Inserta un nodo al principio de la lista
     * @param n es un objeto de tipo Nodo
     */

    public void insertar(Nodo n){

        if (estaVacia()) {
            inicio = n;              // si está vacía añado el nodo como único nodo de la lista
        } else{
            n.setSiguiente(inicio);  // añado el nodo a lista
            inicio = n;              // añado el  nuevo nodo como el inicio de la lista.
        }

    }


        /**
     * Metodo que inserta el nuevo nodo antes que el nodo que recibe
     * @param nuevo es el nuevo nodo a insertar
     * @param sucesor es el nodo que ya se encuentra en la lista
     * @return devuelve true si ha sido insertado o false si no ha sido insertado
     */
    public boolean insertarAntes(Nodo nuevo, Nodo sucesor) {



        if (buscar(sucesor)){
            if (sucesor.equals(inicio)) {           // Si el nodo sucesor es el primero invoco el metodo insertar()
                insertar(nuevo);
                return true;
            }

            for (Nodo aux = getInicio(); aux != null; aux = aux.getSiguiente()) {

                if (aux.getSiguiente() == null)
                    return false;

                if (aux.getSiguiente().equals(sucesor)) {

                    aux.setSiguiente(nuevo);
                    nuevo.setSiguiente(sucesor);
                    return true;
                }

            }
        }

        return false;
    }

    /**
     * Metodo que inserta un nuevo nodo despues de otra que está en la lista
     * @param nuevo es el nuevo nodo a insertar
     * @param precesor es el nodo que ya exite en la lista que será el que preceda al nuevo
     */

    public boolean insertarDespues(Nodo nuevo, Nodo precesor) {

       if (buscar(precesor)) {
           Nodo aux = new Nodo(0);
           aux.setSiguiente(precesor.getSiguiente());
           precesor.setSiguiente(nuevo);
           nuevo.setSiguiente(aux.getSiguiente());

           if (precesor.getSiguiente()== null) {                    // si es el ultimo nodo
               precesor.setSiguiente(nuevo);
               nuevo.setSiguiente(null);
               return true;
           }
           return true;
       }
        return false;


    }

       /**
        * Metodo que busca un nodo pasondole como parametro el valor del nodo
        * @param valor es el valor que contiene el nodo
        * @return true si el nodo está en la lista en otro caso false
        */

       public boolean buscar ( int valor){

           Nodo aux = inicio;
           boolean encontrado = false;

           while (aux != null && !encontrado) {
               if (valor == aux.getValor()) {
                   encontrado = true;
               } else {
                   aux = aux.getSiguiente();
               }
           }
           return encontrado;
       }




    /**
        * Metodo que busca un nodo en la lista
        * @param nodo es el objeto nodo a buscar
        * @return true si el nodo está en la lista
        */

       public boolean buscar (Nodo nodo){

           Nodo aux = inicio;
           boolean encontrado = false;

           while (aux != null && !encontrado) {
               if (nodo.equals(aux)) {
                   encontrado = true;
               } else {
                   aux = aux.getSiguiente();
               }
           }
           return encontrado;
       }

       public int contar(Nodo n) {
           int contador = 0;

           for (Nodo aux = getInicio(); aux != null; aux = aux.getSiguiente()) {

               if (aux.getSiguiente() == null)
                   return contador;
               if (aux.getSiguiente().equals(n))
                   ++contador;


           }
           return contador;
       }

    /**
     * Metodo que borra un nodo de la lista
     * @param n es el nodo a borrar
     * @return true si el nodo se ha borrado o false en el caso contrario
     */

    public boolean borrar(Nodo n) {
           if (buscar(n))
               for (Nodo aux = getInicio(); aux != null; aux = aux.getSiguiente()) {

                   if (aux.getSiguiente() == null)
                       return false;
                   if (aux.equals(n))
                       inicio=inicio.getSiguiente();         // si el nodo a borrar es el de inicio asigna inicio...

                   if (aux.getSiguiente().equals(n))
                       aux.setSiguiente(n.getSiguiente());
               }

           return false;
       }

        /**
         * Metodo que borra todos los nodos de la lista
         */
        public void borrar() {
            inicio=null;
        }

    /**
     * Metodo que devuelve la posicion del nodo recibido por parametro
     * @param n es el nodo a devolver su posición
     * @return la posicion del nodo ó -1 si no se encuentra
     */

    public int getPosicion(Nodo n) {
            int pos = 0;

            for (Nodo aux = getInicio(); aux != null; aux = aux.getSiguiente()) {
                pos++;
                if (aux.getSiguiente() == null)
                    return -1;

                if (aux.getSiguiente().equals(n)) {
                    return pos;
                }
            }

            return -1;
        }


       public boolean estaVacia() {
           return inicio == null;
       }
   }


