import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Principal {


    public static void main(String[] args) {
        HashSet<Integer> conjuntoA = new HashSet<>();
        HashSet<Integer> conjuntoB = new HashSet<>();

        conjuntoA.add(1);
        conjuntoA.add(2);
        conjuntoA.add(3);
        conjuntoA.add(4);
        conjuntoA.add(5);

        conjuntoB.add(1);
        conjuntoB.add(3);
        conjuntoB.add(5);


        //VAMOS AL LIO
        System.out.println(Arrays.toString(conjuntoA.toArray()));
        System.out.println(Arrays.toString(conjuntoB.toArray()));
        System.out.println("VAMOS AL LIO");

        //PERTENENCIA
        System.out.println(conjuntoA.containsAll(conjuntoB));
        System.out.println(conjuntoB.containsAll(conjuntoA));

        //UNION //LOS DOS CONJUNTOS TIENEN ELEMENTOS REPETIDOS Y COMO EL SET NO PUEDE TENER ELEMENTOS REPETIDOS SE QUEDA IGUAL.
        HashSet<Integer> union1 = conjuntoA;
        union1.addAll(conjuntoB);
        System.out.println(Arrays.toString(union1.toArray()));

        //DIFERENCIA
        HashSet<Integer> diferencia1 = conjuntoA;
        diferencia1.removeAll(conjuntoB);
        System.out.println(Arrays.toString(diferencia1.toArray()));

        //INCLUSION
        HashSet<Integer> inclusion1 = conjuntoA;
        inclusion1.retainAll(conjuntoB);
        System.out.println(Arrays.toString(inclusion1.toArray()));
        
        //INTERSECCION
        System.out.println(interseccion(conjuntoA,conjuntoB));

    }

    public static HashSet<Integer> interseccion(Set<Integer> conjuntoA, Set<Integer> conjuntoB){
        HashSet<Integer> result = new HashSet<>();
        for (Integer x: conjuntoA) {
            if (conjuntoB.contains(x))
                result.add(x);
        }
        return result;
    }
}
