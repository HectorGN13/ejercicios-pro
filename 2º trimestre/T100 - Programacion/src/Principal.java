public class Principal {

    public static void main(String[] args) {
        char[] caracters = {'A','B','C','D','E','F'};
        mostrar(caracters);

    }

    public static void mostrar(char[] caracter){
        assert caracter != null : "Error: el array no puede ser null";
        String result = "";
        result += (String.valueOf(caracter[0]));
        for (int i = 1; i < caracter.length; i++) {
            result += ("," + caracter[i]);
        }
        System.out.println(result);
    }
}
