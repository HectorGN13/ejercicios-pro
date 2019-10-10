import java.util.Scanner;

public final class Entrada {


    private Entrada() {
    }

    public static boolean leerOpcion(String opciones){
        Scanner entrada = new Scanner(System.in);
        char opcion = entrada.nextLine().charAt(0);
        return  opciones.indexOf(opcion) >= 0;
    }


    public static void leerEntrada(){

        Scanner scn = new Scanner(System.in);

        System.out.println("Introduzca una opcion:");
        System.out.println("A) leer nombre");
        System.out.println("B) leer double");
        System.out.println("C) leer entero");
        String cadena = scn.nextLine();
        if (cadena.indexOf("A") == 0){
            leerString();
        } else if (cadena.indexOf("B") == 0){
            leerDouble();
        } else if (cadena.indexOf("C") == 0){
            leerEntero();
        }else {
            System.out.println("Opcion incorrecta, vuelva a introducir una opcion:");
            leerEntrada();
        }
    }

    public static String leerString(){
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();  //leer un String

    }

    public static double leerDouble(){
        Scanner scn = new Scanner(System.in);
        return scn.nextDouble(); //leer un double
    }

    public static int leerEntero(){
        Scanner scn = new Scanner(System.in);
        return scn.nextInt(); //leer un entero
    }

}
