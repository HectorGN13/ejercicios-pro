public class Principal {

    public static void main(String[] args) {
        System.out.println(repetidos1("PARAPETAR"));
        System.out.println(repetidos2("PARAPETAR"));
        System.out.println(repetidos3("PARAPETAR"));
    }

    private static String repetidos1(String s){

        assert s != null : "Error: el string introducido no puede ser null";


        String aux = "";



        if (s.length() < 2) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i != j) {
                    if (s.charAt(i) == s.charAt(j)) {
                        aux += s.charAt(j);
                        break;
                    }
                }
            }
        }
        return aux;
    }


    private static String repetidos2(String s){

        assert s != null : "Error: el string introducido no puede ser null";


        if (s.length() < 2) {
            return s;
        }

        String aux = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length()-1; j > i; j--) {
                if (s.charAt(i) == s.charAt(j) && aux.indexOf(s.charAt(i)) == -1){
                    aux += s.charAt(i);
                    break;
                }
            }
        }
        return  aux;
    }

    private static String repetidos3(String s){

        assert s != null : "Error: el string introducido no puede ser null";


        if (s.length() < 2) {
            return s;
        }

        String aux = "";
        for (int i = 0; i < s.length(); i++) {
            if (aux.indexOf(s.charAt(i)) == -1)
                aux += s.charAt(i);
        }
        return  aux;
    }

}
