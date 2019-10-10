import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Principal {

    public static void main(String[] args) {
        leerFichero("src/cancion.txt");
    }

    private static void  leerFichero(String nombreFichero)  {
        try (FileReader archivo = new FileReader(nombreFichero);
             BufferedReader b = new BufferedReader(archivo)) {

            String linea = "";
            do {
                System.out.println(linea);
            } while ((linea = b.readLine()) != null);


        } catch (FileNotFoundException e) {
            System.err.println("Error: fichero no encontrado");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
