public class Principal {
    public static void main(String[] args) {
        System.out.println(contar("AEIOU", "PROGRAMACIONES DE CURSO"));
    }

    /**
     * Nombre: contar(String caracteres, String frase)
     * Metodo que cuenta los caracteres recibidos por parametros dentro de una frase tambien recibida pro parametros.
     * devuelve el numero de repeteciones
     * @param caracteres No pueden estar repetidos.
     * @param frase Oracion sobre la que se quiere buscar coincidencias.
     * @return entero con el numero de coincidencias.
     */
    private static int contar(String caracteres, String frase){
        boolean error = false;
        for (int i = 0; i < caracteres.length()-1; i++) {
            for (int j = caracteres.length()-1; j > i ; j--) {
                if (caracteres.charAt(i) == caracteres.charAt(j))
                    error = true;
            }
        }
        assert !error : "La secuencia de caracteres a buscar tiene un caracter repetido";

        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            for (int j = 0; j < caracteres.length(); j++) {
                if(frase.charAt(i) == caracteres.charAt(j))
                    contador++;
            }

        }
        return contador;
    }
}
