import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {


    private static Formatter output;
    private static Scanner input;


    public static void main(String[] args) {
        openFile();
        addRecords();
        //closeFile();
    }

    // open file clients.txt
    public static void openFile() {

        try {
            output = new Formatter("clients.txt");
            // Aqui no se puede usar try con recursos ya que lanzaria FormaterCloseException en el metodo addRecords()
            // al cerrar output

        } catch (SecurityException securityException) {
            System.err.println("Write permission denied. Terminating.");
            System.exit(1); // terminate the program
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error opening file. Terminating.");
            System.exit(1); // terminate the program
        }
    }

    // add records to file
    public static void addRecords() {

            try (Scanner entrada = new Scanner(System.in)) {
                input = entrada;
                System.out.printf("%s%n%s%n? ",
                        "Enter account number, first name, last name and balance.",
                        "Enter end-of-file indicator to end input.");

                while (entrada.hasNext()) {
                    output.format("%d %s %s %.2f%n", entrada.nextInt(),
                            entrada.next(), entrada.next(), entrada.nextDouble());

                    System.out.print("? ");

                    // output new record to file; assumes valid input
                }

            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error writing to file. Terminating.");
            } catch (NoSuchElementException elementException) {
                System.err.println("Invalid input. Please try again.");
                input.nextLine(); // discard input so user can try again
            }



    }

    // close file
    public static void closeFile() {
        if (output != null)
            output.close();

    }
} // end class CreateTextFile

