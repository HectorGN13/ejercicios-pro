import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileSequential {

    private static ObjectInputStream entrada;

    public static void main(String[] args) {

        abrirFichero();
        anadirAlFichero();
        //cerrarFichero();

    }

    private static void abrirFichero()  {
        try {
            entrada = new ObjectInputStream(Files.newInputStream(Paths.get("src/Clientes.txt")));

        } catch (IOException e) {
            System.out.println("Error al abrir el fichero");
            System.exit(1);
        }
    }

    private static void anadirAlFichero() {

        System.out.printf("%-10s%-12s%-12s%10s%n", "ID", "Nombre", "Apellido", "Sueldo");

        try {
            while (true) {
                Account record = (Account) entrada.readObject();

                // display record contents
                System.out.printf("%-10d%-12s%-12s%10.2f%n", record.getId(), record.getNombre(),
                        record.getApellido(), record.getSueldo());
            }
        } catch (EOFException e) {
            System.out.printf("No hay más que guardar %n");
        } catch (ClassNotFoundException e) {
            System.err.println("Error: Objeto invalido ");
        } catch (IOException e){
            System.err.println("Error al leer el archivo");
        }
    }

//    private static void cerrarFichero() {
//
//        try {
//            if (entrada != null )
//                entrada.close();
//        } catch (IOException e) {
//            System.out.println("Error al cerrar el fichero");
//            System.out.println();
//        }
//
//    }
}
