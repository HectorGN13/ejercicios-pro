public class Principal {
    public static void main(String[] args) {
        System.out.println(sinCoincidencias("PARAPETARLO"));
        System.out.println(sinCoincidencias(""));
        System.out.println(sinCoincidencias("A"));
    }

    public static String sinCoincidencias(String s) {
        assert s != null : "Error: el string introducido no puede ser null";


        String aux = "";
        String result = "";


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

        for (int i = 0; i < s.length(); i++) {
            if (!aux.contains(String.valueOf(s.charAt(i)))){
                result += s.charAt(i);
            }
        }


        return result;
    }

}
