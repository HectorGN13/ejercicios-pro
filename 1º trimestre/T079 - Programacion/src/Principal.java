public class Principal {

    public static void main(String[] args) {
        System.out.println(sus2("A","O", "METALICA LISA"));
    }

    private static String sus2(String original, String nuevo, String cadena){
        assert original != null : "Error: el caracter a sustituir no puede ser null";
        assert nuevo != null : "Error: el caracter por el que vas a sustituir no puede ser null";
        assert cadena != null : "Error: la cadena original no puede ser null";
        assert !cadena.isEmpty() : "Error: la cadena sobre la que actua el metodo no puede estar vacia";
        assert original.length() == 1 : "Error: solo se puede sustituir un caracter";
        assert nuevo.length() == 1 : "Error: solo se puede sustituir un caracter";

        String result = "";
        int coincidencias = 0;

        if (!cadena.contains(original)){
            return result;
        }

        for (int i = 0; i < cadena.length(); i++) {
            if ((cadena.charAt(i) != original.charAt(0))){
                result += cadena.charAt(i);
            } else {
                coincidencias ++;

                if (coincidencias != 2 ){
                    result += cadena.charAt(i);
                } else
                    result += nuevo;
            }

        }
        return result;
    }
}
