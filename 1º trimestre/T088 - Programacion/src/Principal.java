import java.util.Locale;

public class Principal {

    public static void main(String[] args) {
        System.out.println(vocales5("murcielago"));
        System.out.println(vocales5("murciano"));
        System.out.println(vocales5("consiguieras"));
    }

    private static boolean vocales5(String palabra){
        assert palabra != null : "Error la palabra introducida no puede ser null";

        String vocales = "AEIOU";
        String palabraM = palabra.toUpperCase();
        int contador = 0;
        String encontradas = ""; // Contiene las vocales encontras para luego comprobar que no se repitan

        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < vocales.length(); j++) {
                if (encontradas.contains(String.valueOf(palabraM.charAt(i)))){
                    break;
                } else if (palabraM.charAt(i) == vocales.charAt(j)){
                    encontradas += palabraM.charAt(i);
                    contador++;
                    break;
                }
            }
        }

        return contador == vocales.length();
    }
}
