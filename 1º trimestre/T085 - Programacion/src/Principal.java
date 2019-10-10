public class Principal {
    public static void main(String[] args) {
        System.out.println(en('a', "cuervo"));
        System.out.println(en('a', "cueva"));
    }

    private static boolean en(char caracter, String cadena){
        boolean resultado = false;
        for (int i = 0; i < cadena.length(); i++) {
                if (cadena.charAt(i) == caracter)
                    resultado = true;
        }
        return resultado;
    }
}
