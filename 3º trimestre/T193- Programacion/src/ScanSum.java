import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/**
 * JAVA HOWTO 10E
 */
public class ScanSum {
    public static void main(String[] args) throws IOException {

        Scanner s = null;
        double sum = 0;

        try {
            s = new Scanner(new BufferedReader(new FileReader("src/numeros.txt")));
            s.useLocale(Locale.US);

            while (s.hasNext()) {                // Mientras haya mas token que leer
                if (s.hasNextDouble()) {         // Si el token se puede leer como un double
                    sum += s.nextDouble();
                } else {
                    s.next();


                }
            }
        } finally {
            s.close();
        }

        System.out.println(sum);
    }
}
