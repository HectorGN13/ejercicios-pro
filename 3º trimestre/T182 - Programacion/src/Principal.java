import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {
/*    public static void main(String[] args) {
        int[] array = new int[20];
        try {
            array[-3] = 24;
        } catch (ArrayIndexOutOfBoundsException excepcion) {
            excepcion.printStackTrace();
        }
    }*/


        static String filepath = "C:\\Users\\hector\\Desktop\\ejemplo\\ejemplo2.txt";
        public static void main(String[] args) {
            BufferedReader br = null;
            String curline;
            try {
                br = new BufferedReader(new FileReader(filepath));

                while ((curline = br.readLine()) != null) {
                    System.out.println(curline);
                }

            } catch (IOException e) {
                System.err.println(e.getMessage());
            }finally{
                try {
                    if(br != null)
                        br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
}

