import java.util.NoSuchElementException;
import java.util.Scanner;

/*
LANZAR Y CAZAR

¿QUE DIFERENCIA HAY ENTRE LAS DOS? JUSTIFICA TU RESPUESTA.


 */

public class Principal {

    public static void main(String[] args) {


        boolean correcto = false;
        do {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.print("Introduzca el valor inicial del rango: ");
                int inicio = sc.nextInt();
                System.out.print("Introduzca el valor final del rango: ");
                int fin = sc.nextInt();
                System.out.println(Util.obtenerPares(inicio,fin));
                correcto = true;
            } catch (IllegalStateException | NoSuchElementException |  ExcepcionRangoInvalido e) {
                System.out.println(e.getMessage());
            }
        } while (!correcto);

      //mostrarArray(Util.cambiarMayus("E"));

    }

    private static void mostrarArray(String[] array) {
        if (array== null)
            throw new NullPointerException("El array recibido no puede ser nulo");
        if (array.length <=0)
            throw new ExcepcionLongitudInvalida("Error: el array recibido debe ser de longitud mayor de 0");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
