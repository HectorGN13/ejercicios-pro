import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Principal {
    public static final String WEB = "http://www.example.com/myfile.txt";

    public static void main(String[] args) {


        try {
            URL url = new URL(WEB);
            InputStream stream = url.openStream();
            BufferedInputStream bufer = new BufferedInputStream(stream);

            StringBuilder sb = new StringBuilder();

            while (true) {
                int dato = bufer.read();

                if (dato == -1)
                    break;
                else
                    sb.append((char)dato);
            }

            System.out.println(sb);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}