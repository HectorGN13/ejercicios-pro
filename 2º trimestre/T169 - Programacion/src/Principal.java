import java.util.*;


public class Principal {

    public static void main(String[] args) {

        //EJEMPLO HASHMAP
        //Ordena por el orden del Hash y si dan el mismo resultado, luego lo hace por el equals.

        HashMap<Alumno, String> ejemploHash = new HashMap<>();

        ejemploHash.put(new Alumno("Pepillo"), "El bueno");
        ejemploHash.put(new Alumno("Manolillo"), "El feo");
        ejemploHash.put(new Alumno("Fulanillo"), "El malo");


        Iterator it = ejemploHash.keySet().iterator();
        while(it.hasNext()){
            Alumno key = (Alumno) it.next();
            System.out.println("Nombre: " + key.toString() + " -> Mote: " + ejemploHash.get(key));
        }

        System.out.println();
        System.out.println();


        //EJEMPLO TREEMAP
        //Ordena por el orden natural. segun el compareTo.

        TreeMap<Alumno, String> ejemploTree = new TreeMap<>();

        ejemploTree.put(new Alumno("Pepillo"), "El bueno");
        ejemploTree.put(new Alumno("Manolillo"), "El feo");
        ejemploTree.put(new Alumno("Fulanillo"), "El malo");

        Iterator it2 = ejemploTree.keySet().iterator();
        while(it2.hasNext()){
            Alumno key = (Alumno) it2.next();
            System.out.println("Nombre: " + key.toString() + " -> Mote: " + ejemploTree.get(key));
        }
    }
}
