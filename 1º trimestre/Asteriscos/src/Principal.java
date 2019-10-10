public class Principal {

    public static void main(String[] args) {
        asteriscos(7, "$");
    }

    public static void asteriscos(int x, String simbolo){
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.println("");
                for (int k = 0; k <= j ; k++) {
                    System.out.print(simbolo);
                }
            }
            System.out.println("");
            lineas(i);

        }
    }

    public static void lineas(int x){
        for (int j = 0; j < x; j++) {
            System.out.print("_");
        }
        System.out.println("");
    }
}
