import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateSequentialFile {

    private static ObjectOutputStream output; // outputs data to file

    public static void main(String[] args) {
        openFile();
        addRecords();
        closeFile();


    }

    private static void openFile() {

        try {
            output = new ObjectOutputStream(
                    Files.newOutputStream(Paths.get("clients.ser")));

        } catch (IllegalArgumentException e) {
            System.out.println("Error: Las condiciones previas en el uri no se mantienen");
        } catch (FileSystemNotFoundException e) {
            System.out.println("Error: El sistema de archivo no existe y no puede crear el archivo ");
        } catch (SecurityException e) {
            System.out.println("Error: Permiso denaegado para acceder al sistema de archivos ");
        } catch (IOException e) {
            System.out.println("Error al abrir el fichero");
            System.exit(1);
        }

    }

    private static void addRecords() {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("%s%n%s%n? ", "Introduce el ID de cuenta, Nombre, apellido y  sueldo.",
                "Enter para indicar el final de fila.");

        while (entrada.hasNext()){

            try {
                Account record = new Account(entrada.nextInt(), entrada.next(), entrada.next(), entrada.nextDouble());
                // serialize record object into file
                output.writeObject(record);
            } catch (InputMismatchException e) {
                System.out.println("Error: El ID ó  saldo no coincide con la expresion regular Integer o está fuera de rango ");
                break;
            } catch (NoSuchElementException e) {
                System.out.println("Error: Entrada invalida intentelo de nuevo ");
                entrada.nextLine();
            } catch (IllegalStateException e) {
                System.out.println("Error: el scanner está cerrado");
            } catch (IOException e) {
                System.out.println("Error escribiendo el fichero");
                break;
            }

            System.out.println("? ");

        }

    }

    private static void closeFile() {

        try {
            if (output != null )
                output.close();
        } catch (IOException e) {
            System.out.println("Error al cerrar el fichero");
        }
    }
}
