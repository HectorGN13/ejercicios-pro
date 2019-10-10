import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Nodo<Integer> n1 = new Nodo<>(32);
        Nodo<Integer> n2 = new Nodo<>(22);
        Nodo<Integer> n3 = new Nodo<>(12);
        Nodo<Integer> n4 = new Nodo<>(42);
        Nodo<Integer> n5 = new Nodo<>(52);
        Nodo<Integer> n6 = new Nodo<>(62);


        //Nodo<Integer>[] ejemplo = {n1, n2, n3, n4, n5, n6}; PORKE ESTA MIERDA NO SE PUEDE HACER

        List<Nodo<Integer>> ejemplo = new ArrayList<>();
        ejemplo.add(n1);
        ejemplo.add(n2);
        ejemplo.add(n3);
        ejemplo.add(n4);
        ejemplo.add(n5);
        ejemplo.add(n6);

        Nodo[] x = (Nodo[])ejemplo.toArray();    // ESTO ME FALLA Y NO ME CASTEA.!!!!! PUTA VIDA
        ordenarArrayAscendente(x);
        for (Nodo aX : x) {
            aX.toString();
        }


    }

    private static void ordenarArrayAscendente(Nodo[] nodos){
        for (int i = 0 ; i < nodos.length - 1 ; i++) {
            int min = i;

            for (int j = i + 1 ; j < nodos.length ; j++) {
                if (nodos[j].compareTo(nodos[min])< 0) {
                    min = j;
                }
            }
            if (i != min) {
                Nodo aux = nodos[i];
                nodos[i] = nodos[min];
                nodos[min] = aux;
            }
        }
    }
}
