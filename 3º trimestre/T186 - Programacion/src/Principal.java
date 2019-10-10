import java.util.Scanner;
import java.util.Stack;

public class Principal {
    public static void main(String[] args) {

        Stack<Integer> pila = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println("Elija una opcion:");
        System.out.println("1) Comprobar si está vacia");
        System.out.println("2) Obtener el primer elemento sin sacarlo");
        System.out.println("3) Obtener el primer elemento");
        System.out.println("4) Agregar un elemento");
        System.out.println("5) Limpiar la pila");

        System.out.println("Qué desea hacer? ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println(pila.isEmpty());
                break;
            case 2:
                System.out.println(pila.peek());
                break;
            case 3:
                System.out.println(pila.pop());
                break;
            case 4:
                System.out.print("Introduzca un numero: ");
                pila.add(sc.nextInt());
                break;
            case 5:
                pila.clear();
                break;
            default:
                throw new UnsupportedOperationException("Opcion no implementada");
        }

    }
}

