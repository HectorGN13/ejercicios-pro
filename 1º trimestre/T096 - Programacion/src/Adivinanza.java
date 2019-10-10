import java.util.Random;
import java.util.Scanner;

public final class Adivinanza {

    private Adivinanza() {
    }

    public static void jugar(){
        Parametros p = menu();
        int aleatorio = generarAleatorio(p.inicio, p.fin);
        boolean correcto;
        int contador = 0;
        do {

            System.out.println("Introduzca un numero:");
            System.out.println("->");
            int numero = leerOpcion();
            correcto = logica(numero, aleatorio);
            contador++;
            System.out.println("Intentos restantes==> " + (p.intentos-contador));

        } while ((!correcto) && contador < p.intentos);
        System.out.println("Fin");
        System.out.println("Intentos restantes==> " + (p.intentos-contador));

    }


    private static Parametros menu(){
        int x,y,intentos;
        System.out.println("Bienvenidos al juego de las adivinanzas");
        System.out.println("");
        System.out.println("INFORMACION:");
        System.out.println("Tienes que intentar adivinar un numero dentro de un rango [x,y].");
        System.out.println("Elige el inicio del rango (Piensa que el numero que elijas tambien estará incluido en el rango)");
        System.out.println("->");

        Scanner scn = new Scanner(System.in);
        x = scn.nextInt();

        System.out.println("Muy bien! ahora elije el final del rango (Recuerda: tambien estará incluido dentro del rango).");
        System.out.println("->");

        boolean correcto = false;

        do {
            y = scn.nextInt();
            if (y > x)
                correcto = true;
            else {
                System.out.printf("Error el final del rango que has introducido (%d) no es mayor que el inicio (%d).\n",y,x);
                System.out.println("Por favor, intentelo de nuevo.");
                System.out.println("->");
            }
        } while (!correcto);

        System.out.println("ESTUPENDO!!! :)");
        System.out.println("Ahora vamos a elegir la cantidad de intentos que te gustaria disponer.");
        System.out.println("->");

        intentos = scn.nextInt();

        System.out.println("OK! ahora comencemos...");

        return new Parametros(x,y, intentos);

    }

    static class Parametros{
        private int inicio;
        private int fin;
        private int intentos;

        private Parametros(int inicio, int fin, int intentos){
            this.inicio = inicio;
            this.fin = fin;
            this.intentos = intentos;
        }

    }

    private static boolean logica(int numero, int aleatorio){
        if (numero < aleatorio){
            System.out.printf("El numero %d es menor que el numero que estas buscando...\n",numero);
        } else if (numero > aleatorio) {
            System.out.printf("El numero %d es mayor que el numero que estas buscando...\n",numero);
        } else if (numero == aleatorio){
            System.out.println("Enhorabuena acertaste. :D");
        }
        return numero == aleatorio;
    }

    private static int generarAleatorio(int inicio, int fin){
        int numero;
        Random rnd = new Random();
        numero = rnd.nextInt(fin-inicio)+inicio;
        return numero;
    }

    private static int leerOpcion(){
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }

}
