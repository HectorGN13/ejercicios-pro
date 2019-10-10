import java.util.Scanner;

public class Comparison {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Introduzca el primer entero: ");
        numero1 = scn.nextInt();

        System.out.println("Introduzca el segundo entero: ");
        numero2 = scn.nextInt();

        if (numero1 == numero2){
            System.out.printf("%d == %d%n", numero1, numero2);
        }

        if (numero1 != numero2){
            System.out.printf("%d != %d%n", numero1, numero2);
        }

        if (numero1 < numero2){
            System.out.printf("%d < %d%n", numero1, numero2);
        }

        if (numero1 > numero2){
            System.out.printf("%d > %d%n", numero1, numero2);
        }

        if (numero1 <= numero2){
            System.out.printf("%d <= %d%n", numero1, numero2);
        }

        if (numero1 >= numero2){
            System.out.printf("%d >= %d%n", numero1, numero2);
        }
    }
}
