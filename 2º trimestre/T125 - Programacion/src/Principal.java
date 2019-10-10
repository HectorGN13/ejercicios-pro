import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {


        System.out.println("Bienvenido usuario:" +
                " Cuantos hijos tienes??");

        Scanner scn = new Scanner(System.in);
        int longitud = scn.nextInt();

        Persona[] hijos = new Persona[longitud];

        for (int i = 0; i < hijos.length; i++) {
            System.out.println("Como se llama el " +(i+1)+"º hijo?");
            String nombre = scn.next();
            hijos[i] = new Persona(nombre);
        }

        mostrar(hijos);
    }

    private static void mostrar(Persona[] hijos) {
        for (Persona x:hijos) {
            System.out.println(x);
        }
    }
}
