import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class FilCopy {

    public static void main(String[] args) {

        if (args.length==2)
            copiar(args[0],args[1]);

        else if (args.length==3) {
            try {
                copiar(copiaLineas(args[0],args[2]),args[1]);
            } catch (FileNotFoundException e) {
                System.err.println("Error: fichero no encontrado");
                e.printStackTrace();
            }
        }
        else
            System.out.println("Uso: Filcopy \"ruta origen\", \"ruta destino\", \"expresion regular (opcional)\" ");



    }

    /**
     * Metodo que copia un fichero
     * @param origen es la ruta del fichero a copiar
     * @param destino es la ruta del fichero copiado
     * @throws NullPointerException si el origen o destino es nulo
     * @throws IllegalArgumentException si el origen o destino está vacío.
     *
     */

    private static void copiar(String origen, String destino) throws NullPointerException, IllegalArgumentException {
        if (origen == null)
            throw new NullPointerException("Error: el archivo origen no puede ser nulo");

        if (origen.isEmpty())
            throw new IllegalArgumentException("Error: el archivo origen no puede estar vacio");

        if (destino == null)
            throw new NullPointerException("Error: el archivo destino no puede ser nulo");

        if (destino.isEmpty())
            throw new IllegalArgumentException("Error: el archivo destino no puede esrtar vacio");

        Path org = Paths.get(origen);
        Path des = Paths.get(destino);

        try {
            Files.copy(org,des, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    /**
     * Metoodo que copia las lineas de un fichero que coincida con la expresión regular.
     * @param original es el fichero donde se comprueban las lineas.
     * @param expReg es la expresión regular.
     * @return un arrayList con las lineas que coinciden con la expresion regular.
     * @throws FileNotFoundException si no se encuentra el fichero.
     */

    private static ArrayList<String> copiaLineas(String original, String expReg) throws FileNotFoundException {

        ArrayList<String> lineas = new ArrayList<>();

        FileReader f = new FileReader(original);
        BufferedReader b = new BufferedReader(f);

        String linea = "";

        try {
            while ((linea = b.readLine()) != null) {

                if (linea.matches(expReg))
                    lineas.add(linea);

            }
        } catch (IOException e) {
            System.err.println("Error de Entrada/Salida");
        }

        try {
            f.close();
            b.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return lineas;
    }

    /**
     * Metodo que copia las lineas de un arrayList en un fichero.
     * @param lineas es un arrayList.
     * @param destino es la ruta del fichero donde se desea copiar el arrayList.
     */

    private static void copiar(ArrayList<String> lineas, String destino) {

        try (FileWriter fichero = new FileWriter(destino)) {


            for (String linea : lineas) {
                fichero.write(linea + "\n");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}