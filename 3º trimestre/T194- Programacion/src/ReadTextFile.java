import java.io.IOException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ReadTextFile {

    private static Scanner input;

    public static void main(String[] args) {
        openFile();
        readRecords();
        //closeFile();
    }

    // open file clients.txt

    public static void openFile() {

        try {
            input = new Scanner(Paths.get("clients.txt"));

        } catch (IOException ioException) {
            System.err.println("Error al abrir el archivo");
            System.exit(1);
        }

    }
    // read record from file
    private static void readRecords() {
        System.out.printf("%-10s%-12s%-12s%10s%n", "Account",
                "First Name", "Last Name", "Balance");


        try {
            while (input.hasNext())                                                 // Mientras haya mas que leer
            {
                System.out.printf("%d %s %s %f %n", input.nextInt(),
                        input.next(), input.next(), input.nextDouble());
            }
            // nextInt() y nextDouble() tambien lanza InputMismatchException que no estaba cazada
        }catch (InputMismatchException e){
            System.out.println("El siguiente token no coincide con la expresión regular Integer , o está fuera de rango");
        }catch (NoSuchElementException e) {
            System.out.println("Archivo incorrectamente formado");
        }catch (IllegalStateException e) {
            System.out.println("Error al leer el archivo");
        } finally {
            if (input != null)
                input.close();
        }
    }
    /*private static void closeFile() {
        if (input != null)
            input.close();
    }*/
}
