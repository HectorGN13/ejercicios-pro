import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int numero1;
        int numero2;
        int suma;

        System.out.println("Introduzca el primer entero: ");
        numero1 = scn.nextInt();

        System.out.println("Introduzca el segundo entero: ");
        numero2 = scn.nextInt();

        suma = numero1 + numero2;

        System.out.printf("La suma de los dos numeros es %d%n", suma);

    }
}
