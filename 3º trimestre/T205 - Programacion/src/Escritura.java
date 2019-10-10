import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class Escritura {

    private static ObjectOutputStream salida;


    public static void openFile() {

        try {
            salida = new ObjectOutputStream(
                    Files.newOutputStream(Paths.get("src/animales.txt")));

        } catch (IllegalArgumentException e) {
            System.out.println("Error: Las condiciones previas en el uri no se mantienen");
        } catch (FileSystemNotFoundException e) {
            System.out.println("Error: El sistema de archivo no existe y no puede crear el archivo ");
        } catch (SecurityException e) {
            System.out.println("Error: Permiso denegado para acceder al sistema de archivos ");
        } catch (IOException e) {
            System.out.println("Error al abrir el fichero");
            System.exit(1);
        }

    }



    public static void inicializarAnimales() {
        Animal[] animales = new Animal[5];

        animales[0] = new Animal("VACA",300000);
        animales[1] = new Animal("POLLO",2000);
        animales[2] = new Animal("COMADREJA",3500);
        animales[3] = new Animal("PERRO",25000);
        animales[4] = new Animal("GATO",2700);

        for (int i = 0; i <animales.length ; i++) {

            try {
                salida.writeObject(animales[i]);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void closeFile() {

        try {
            if (salida != null )
                salida.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar el fichero");
        }
    }
}
