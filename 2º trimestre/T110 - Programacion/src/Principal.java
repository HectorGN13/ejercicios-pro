import java.util.Scanner;

public class Principal {


    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        System.out.println("Cuantas personas estan dentro de la habitacion???");
        Habitacion h1 = new Habitacion(new Persona[scn.nextInt()]);
        for (int i = 0; i < h1.ocupantes.length; i++) {
            System.out.println("Cuantos hijos tiene el ocupante "+i+"???");
            int hijos = scn.nextInt();
            h1.ocupantes[i] = new Persona(new Persona[hijos]);
            for (int j = 0; j < hijos; j++) {
                System.out.println("Que edad tiene el hijo "+j+" del ocupante " + i + "???");
                int edad = scn.nextInt();
                h1.ocupantes[i].getHijos()[j] = new Persona(null);
                h1.ocupantes[i].getHijos()[j].setEdad(edad);
            }
        }

        System.out.println(h1.ocupantes);
    }

}
