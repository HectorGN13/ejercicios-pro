import java.util.Random;
public class Ejercicio10 {

    public static void main(String[] args) {

        int[] numeros = generarPares();
        for (int x:numeros) {
            System.out.println(x);
        }
    }

    public static int[] generarPares() {
        final int MAX = 50;
        int[] pares = new int[MAX];
        int total = 0;
        Random rnd = new Random();
        for (int i = 0; i < pares.length; i++) {
            while (total == i); {
                int n = rnd.nextInt(50) + 1;
                if (n % 2 == 0) {
                    pares[total] = n;
                    total++;
                }
            }
        }
        return pares;
    }
}