import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

public class FilCopy {

    public static void main(String[] args) {


        do {
            if (args.length == 2) {
                String origen = args[0];
                String destino = args[1];
                copiar(origen, destino);
            }
            else if (args.length == 3) {
                String origen = args[0];
                String destino = args[1];
                String exp = args[2];
                escribirFichero( leerFichero(origen,exp), destino);
            } else
                System.out.println("Uso: Filcopy \"ruta origen\", \"ruta destino\", \"expresion regular\" ");


        } while (true);

    }

    private static void copiar(String origen, String destino) {
        Path org = Paths.get(origen);
        Path des = Paths.get(destino);

        try {
            Files.copy(org,des, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<String>  leerFichero(String nombreFichero, String expReg)  {

        ArrayList<String> lineas = new ArrayList<>();

        try (FileReader archivo = new FileReader(nombreFichero);
             BufferedReader b = new BufferedReader(archivo)) {

            String linea = "";


            while ((linea = b.readLine()) != null) {

                if (linea.matches(expReg))
                    lineas.add(linea);

            }


        } catch (FileNotFoundException e) {
            System.err.println("Error: fichero no encontrado");
            System.exit(-1);

        } catch (IOException e) {
            e.printStackTrace();
        }

        return lineas;
    }

    private static void escribirFichero(ArrayList<String> lineas, String destino) {

        try (FileWriter fichero = new FileWriter(destino)) {


            for (String linea : lineas) {
                fichero.write(linea + "\n");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}