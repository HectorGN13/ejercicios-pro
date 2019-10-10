import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lectura {

   private static ObjectInputStream entrada;



    public static void abrirFichero()  {
        try {
            entrada = new ObjectInputStream(new FileInputStream("src/animales.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void mostrar() {


        ArrayList<Animal> animals = new ArrayList<>();
        try {
            while (true) {
                Animal a = (Animal) entrada.readObject();
                animals.add(a);
            }


        } catch (EOFException e) {
            System.out.printf(" %n");                       // Salta esta excepcion cuando no hay mas datos que guardar
        } catch (ClassNotFoundException e) {
            System.err.println("Error: Objeto invalido ");
        } catch (IOException e){
            System.err.println("Error al leer el archivo");
        }

        Collections.sort(animals, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.getPeso()-o2.getPeso();
            }
        });

        for (Animal a : animals) {
            System.out.println(a);
        }
    }



    public static void cerrarFichero() {

        try {
            if (entrada != null )
                entrada.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar el fichero");
            System.out.println();
        }

    }
}
