
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        //next() solo lee hasta donde encuentra un espacio (hasta un espacio).
        //nextLine() lee to.do incluyendo espacios (hasta un enter).
        Scanner scn = new Scanner(System.in);
        System.out.println("Introduzca un entero: ");
        int a = scn.nextInt();
        System.out.println("El numero introducido es el: " + a);
        String b = scn.nextLine();
        System.out.println(b);
        String c = scn.next();
        System.out.println(c);
    }
}
