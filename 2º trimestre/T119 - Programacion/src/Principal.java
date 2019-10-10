public class Principal {

    public static void main(String[] args) {

        int[] numeros = new int[]{44,22,12,34,0,-5,69};

        System.out.println("Antes de ordenar");
        mostrar(numeros);
        seleccionDirecta(numeros);
        System.out.println("\nDespués de ordenar");
        mostrar(numeros);


    }

    public static void mostrar(int lista[]){
        for (int aLista : lista) {
            System.out.println(aLista);
        }
    }

    public static void seleccionDirecta(int lista[]){
        int p;
        for (int i = 0; i < lista.length; i++){
            p = posicionMinimo(lista, i);
            intercambiar(lista, p, i);
        }
    }

    private static int posicionMinimo(int lista[], int inicio){
        assert lista != null : "Error: el array no puede ser null";
        assert lista.length > 0 : "El array debe tener al menos un elemento.";
        int p = inicio;
        for (int i = inicio; i < lista.length; i++){
            if(lista[i] < lista[p]){ p = i; }
        }
        return p;
    }

    private static void intercambiar(int lista[], int a, int b){
        if (a != b && a >= 0 && a < lista.length && b < lista.length && b >= 0){
            int aux = lista[a];
            lista[a] = lista[b];
            lista[b] = aux;
        }
    }


}

//    public static int[] seleccionDirecta(int[] array) {
//        int posmin;
//        int aux;
//        int[] arrayOrdenado;
//
//        for (int i = 0; i <array.length-1; i++)
//        {
//            posmin = i;
//            for (int j=i+1; j < array.length; j++)
//                if (array[j] < array[posmin])
//                    posmin = j;
//            aux = array[posmin];
//            array[posmin] = array[i];
//            array[i] = aux;
//        }
//        arrayOrdenado = array;
//        return arrayOrdenado;
//    }