import java.util.Scanner;

public class Entrada
{
    private static Scanner sc = new Scanner(System.in);

    private Entrada(){}


    public static String leerAlias() {
        System.out.println("Introduzca un nombre: ");

        return sc.nextLine();
    }

    public static char leerGenero() {
        char genero = 'V';
        boolean correcto = false;

        do {
            System.out.print("Genero (V,F): ");
            genero = sc.next().charAt(0);

            correcto = Personaje.preGenero(genero);

            if (!correcto)
                System.out.println("Error: genero no valido");
        } while (!correcto);

        return genero;
    }

    public static TipoColorPelo leerColorPelo() {

        System.out.print("Color del pelo:");
        System.out.println("1) RUBIO");
        System.out.println("2) MORENO");
        System.out.println("3) CANOSO");
        System.out.println("4) PELIRROJO");
        System.out.println("0) SALIR");

        TipoColorPelo color = null;
        boolean correcto = false;

        do {

            int opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    color = TipoColorPelo.AMARILLO;
                    correcto = true;
                    break;
                case 2:
                    color = TipoColorPelo.NEGRO;
                    correcto = true;
                    break;
                case 3:
                    color = TipoColorPelo.BLANCO;
                    correcto = true;
                    break;
                case 4:
                    color = TipoColorPelo.ROJO;
                    correcto = true;
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    correcto = true;
                    break;
                default:
                    System.out.println("Opcion incorrecta...");
                    break;
            }

        } while (!correcto);

        return color;
    }

    public static boolean leerGafas() {

        System.out.println("Tiene gafas (S|N) :");
        char opcion;
        boolean correcto = false;
        boolean gafas = false;
        do {
            opcion = sc.next().charAt(0);
            if (opcion == 'S' || opcion == 's'){
                gafas = true;
                correcto = true;
            } else if (opcion == 'N' || opcion == 'n'){
                gafas = false;
                correcto = true;
            }
            if (!correcto)
                System.out.println("Error: opcion no valida(Debes introducir s|n) ");
        } while (!correcto);
    return gafas;

    }

    public static boolean leerSombrero() {

        System.out.println("Tiene sombrero (S|N) :");
        char opcion;
        boolean correcto = false;
        boolean sombrero = false;
        do {
            opcion = sc.next().charAt(0);
            if (opcion == 'S' || opcion == 's'){
                sombrero = true;
                correcto = true;
            } else if (opcion == 'N' || opcion == 'n'){
                sombrero = false;
                correcto = true;
            }
            if (!correcto)
                System.out.println("Error: opcion no valida(Debes introducir s|n) ");
        } while (!correcto);
        return sombrero;

    }

    public static boolean leerFuma() {

        System.out.println("Esta fumanodo (S|N) :");
        char opcion;
        boolean correcto = false;
        boolean fuma = false;
        do {
            opcion = sc.next().charAt(0);
            if (opcion == 'S' || opcion == 's'){
                fuma = true;
                correcto = true;
            }else if (opcion == 'N' || opcion == 'n'){
                fuma = false;
                correcto = true;
            }
            if (!correcto)
                System.out.println("Error: opcion no valida(Debes introducir s|n) ");
        } while (!correcto);
        return fuma;

    }
}
