public class Principal {

    public static void main(String[] args) {
        System.out.println("");
        dibujar("CIRCULO", '#');
        System.out.println("");
        dibujar("OVALO", '#');
        System.out.println("");
        dibujar("TRIANGULO", '#');
        System.out.println("");
        System.out.println("");
        System.out.println("");
        dibujar("ROMBO", '#');
        System.out.println("");
        dibujar("PARALELOGRAMO", '#');
        System.out.println("");
        System.out.println("");
        dibujar("CUADRADO", '#');
        System.out.println("");
        System.out.println("");
        System.out.println("");
        dibujar("RECTANGULO", '#');
        System.out.println("");
        System.out.println("");
        System.out.println("");
        dibujar("TRAPECIO", '#');
        dibujar("PENTAGONO", '#');
    }

    private static void dibujarCirculo(Character caracter){

        //Ecuacion (x-h)elevado a 2 + (y-K)elevado a 2 = radio elevado a dos
        //h y k son dos coordenadas del centro

        double x = 10.0;
        for (double i = 0.0; i <= x * 2.0 ; i++) {
            for (double j = 0.0; j <= x * 2.0; j++) {
               if (Math.pow(j-x,2.0)+ Math.pow(i-x,2.0) <= Math.pow(x,2.0)){
                   System.out.printf(caracter+" ");
               } else {
                   System.out.printf("  ");
               }
            }
            System.out.println("");
        }
    }

    private static void dibujarOvalo(Character caracter){
        double x = 10.0;
        double y = 10.0;
        for (double i = 0.0; i <= y * 2.0 ; i++) {
            for (double j = 0.0; j <= x * 2.0; j++) {
                if (Math.pow(j-x,2.0)/20 + Math.pow(i-y,2.0)/6 <= 5){
                    System.out.printf(caracter + " ");
                } else {
                    System.out.printf("  ");
                }
            }
            System.out.println("");
        }
    }

    private static void dibujarTriangulo(Character caracter){
        double x = 10.0;
        for (double i = 0.0; i <= x ; i++) {
            for (double j = x - i; j > 0.0; j--) {
                System.out.printf(" ");
            }
            for (double j = 0.0; j < i; j++) {
                System.out.printf(" " +caracter);
            }
            System.out.println("");
        }
    }

    private static void dibujarRombo(Character caracter){
        double x = 10.0;
        for (double i = 0.0; i <= x ; i++) {
            for (double j = x - i; j > 0.0; j--) {
                System.out.printf(" ");
            }
            for (double j = 0.0; j < i; j++) {
                System.out.printf(" " +caracter);
            }
            System.out.println("");
        }

        for (double i = 0.0; i <= x ; i++) {
            for (double j = 0.0; j <= i; j++) {
                System.out.printf(" ");
            }
            for (double j = x - i - 1.0; j > 0.0; j--) {
                System.out.printf(" " +caracter);
            }
            System.out.println("");
        }
    }

    private static void dibujarParalelogramo(Character caracter){
        double x = 10.0;
        for (double i = 0.0; i < x ; i++) {
            for (double j = x - i; j > 0; j--) {
                System.out.printf("  ");
            }
            for (double j = 0.0; j < x; j++) {
                System.out.printf(" " +caracter);
            }
            System.out.println("");
        }
    }

    private static void dibujarCuadrado(Character caracter){
        double x = 10.0;
        for (double i = 0.0; i < x ; i++) {
            for (double j = 0.0; j < x; j++) {
                System.out.printf(caracter + " ");
            }
            System.out.println("");
        }
    }

    private static void dibujarRectangulo(Character caracter){
        double x = 10.0;
        for (double i = 0.0 ; i < x ; i++) {
            for (double j = 0.0; j < x * 2.0; j++) {
                System.out.printf(caracter + " ");
            }
            System.out.println("");
        }
    }

    private static void dibujarTrapecio(Character caracter){
        double x = 10.0;
        for (double i = 0.0; i < x ; i++) {
            for (double j = x - i; j > 0.0; j--) {
                System.out.printf(" ");
            }
            for (double j = 0.0; j < x+i; j++) {
                System.out.printf(caracter + " ");
            }
            System.out.println("");
        }
    }

    public static void dibujar(String figura, Character caracter){
        switch (TipoFigura.valueOf(figura)){
            case ROMBO:
                dibujarRombo(caracter);
                break;
            case OVALO:
                dibujarOvalo(caracter);
                break;
            case CIRCULO:
                dibujarCirculo(caracter);
                break;
            case CUADRADO:
                dibujarCuadrado(caracter);
                break;
            case TRAPECIO:
                dibujarTrapecio(caracter);
                break;
            case TRIANGULO:
                dibujarTriangulo(caracter);
                break;
            case RECTANGULO:
                dibujarRectangulo(caracter);
                break;
            case PARALELOGRAMO:
                dibujarParalelogramo(caracter);
                break;
            default:
                System.out.println("FIGURA ESPECIFICADA NO ENCONTRADA");
                break;

        }
    }

}
