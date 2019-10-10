import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        mostrarMenu();
    }


    private static void mostrarMenu(){
        System.out.println("1) Crear Urna");
        System.out.println("2) Agregar Bola");
        System.out.println("3) Extraer Bola");
        System.out.println("4) Mostrar Urna");
        System.out.println("0) Salir");

        System.out.println("Introduzca una opción: ");
        char opcion = leerOpcion("12340");
        switch (opcion){
            case '1':
                System.out.println("PTE: CREAR URNA");
                break;
            case '2':
                System.out.println("PTE: AGREGAR BOLA");
                break;
            case '3':
                System.out.println("PTE: EXTRAER BOLA");
                break;
            case '4':
                System.out.println("PTE: MOSTRAR URNA");
                break;
            case '0':
                break;
            default:
                System.err.printf("Error: opcion %c desconocida", opcion);

        }
        System.out.println("¡HASTA LA PROXIMA!");
    }


    /**
     * PROGRAMACION ESTRUCTURADA SI EDUARDO TE LO PIDE!!!
     * @param opciones
     */
    public static char leerOpcion(String opciones){
        assert opciones != null : "Error: opciones no puede ser null";
        assert !opciones.isEmpty() : "Error: las opciones no puede estar vacio.";

        Scanner scn = new Scanner(System.in);
        char opcion;
        boolean correcto;
            do {
                opcion = scn.nextLine().charAt(0);
                correcto = opciones.indexOf(opcion) >= 0;
                if (!correcto){
                    System.out.printf("Error: opcion %s incorrecta (opciones validas: 1, 2, 3, 4, 0.)", opcion);
                }
            } while (!correcto);


        return opcion;
    }
}
