import java.util.Iterator;
import java.util.TreeSet;

public class Principal {

    public static void main(String[] args) {

        TreeSet<Animal> animales = new TreeSet<>();

        animales.add(new Animal("gatito", 5));
        animales.add(new Animal("perrito", 15));
        animales.add(new Animal("patito", 1));
        animales.add(new Animal("torito", 600));

        animales.add(new Animal("gatito", 5));
        animales.add(new Animal("gatito", 15));

        for (Animal x : animales) {
            System.out.println(x);
        }


        System.out.println();

        Iterator<Animal> iterator = animales.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "\n");
        }
    }

}
