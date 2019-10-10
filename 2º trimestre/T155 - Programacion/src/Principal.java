import java.util.ArrayList;
import java.util.LinkedList;

public class Principal {


    public static void main(String[] args) {
        ArrayList<Integer> arrayList= new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        arrayList.add(12);
        arrayList.add(13);
        arrayList.add(14);

        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(14);

        int x = arrayList.get(2);
        int y = linkedList.get(2);

        System.out.println(x);
        System.out.println(y);

        /*
        EN EL EJEMPLO DEL LINKEDLIST:
        Primero hace una validacion de parametros a traves de un metodo auxiliar que lanza una excepcion para saber si esta dentro del rango.
         private boolean isElementIndex(int index) { return index >= 0 && index < size; }
         y luego llama a un metodo nodo que te devuelve un nodo a traves de un indice.

        EN EL EJEMPLO DEL ARRAYLIST:
        Primero hace una validacion de parametros
        public static <X extends RuntimeException>
    i    int checkIndex(int index, int length,
                   BiFunction<String, List<Integer>, X> oobef) {
        if (index < 0 || index >= length)
            throw outOfBoundsCheckIndex(oobef, index, length);
        return index;
    }
         y luego te devuelve el elemento en un array interno que tiene el creado.

            E elementData(int index) {
        return (E) elementData[index];
    }
         */
    }
}
