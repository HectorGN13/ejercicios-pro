public class CifradoXOR {

    public static String cifrar(String cadena, String clave){
        String result = "";

        char[] chars = cadena.toCharArray();
        char[] contrasenia = clave.toCharArray();

        int pass = 0;

        for (int i = 0; i < contrasenia.length; i++) {
            pass += contrasenia[i];
        }

        for (int i = 0; i < chars.length; i++) {
            char c = (char)(chars[i]^pass);
            result = result + c;
        }

        return result;

    }

}
