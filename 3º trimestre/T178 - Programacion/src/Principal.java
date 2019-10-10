import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try {
            division(1, 0);
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }

    // ArithmeticException
    private static int division(int numerador, int denominador) {
        if (denominador == 0)
            throw new ArithmeticException("Error: division por 0");
        return numerador / denominador;
    }

    // InputMismatchException
    private static void dividir() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int numerador;
        int denominador;
        try {
            System.out.println("Numerador: ");
            numerador = sc.nextInt();
            System.out.println("Denominador: ");
            denominador = sc.nextInt();
            System.out.println(division(numerador, denominador));
        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
    }

    // IllegalArgumentException
    // NullPointerException
    private static double media(int[] notas) throws NullPointerException, IllegalArgumentException {
        if (notas == null)
            throw new NullPointerException("Error: notas es nulo");
        if (notas.length <= 0)
            throw new IllegalArgumentException("Error: el array de notas no contiene elementos");

        double resultado = 0;

        for (int i = 0; i < notas.length; i++)
            resultado += notas[i];

        return resultado / notas.length;
    }
}
