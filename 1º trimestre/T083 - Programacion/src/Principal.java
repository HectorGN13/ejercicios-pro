public class Principal {
    public static void main(String[] args) {


        mostrar('A');
        for (int i = 0; i < 5; i++) {
            mostrar('B');
            mostrar('D');
            mostrar('C');
        }
    }

    public static boolean mostrar(char caracter) {
        System.out.print(caracter);
        return true;
    }
}
