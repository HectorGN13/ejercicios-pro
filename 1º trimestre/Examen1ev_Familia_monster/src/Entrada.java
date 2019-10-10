import java.util.Scanner;

public final class Entrada {

    //Constructor

    private Entrada() {}


    // Interface de la clase

    public static String leerString(){
        Scanner scn = new Scanner(System.in);
        String string;
        boolean correcto = false;
        do {
            string = scn.nextLine();
            if (!string.isEmpty()){
                correcto = true;
            } else {
                Salida.mostrarOpcionIncorrecta();
            }
        } while (!correcto);
        return string;
    }

    public static int leerEntero(){
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }


}
