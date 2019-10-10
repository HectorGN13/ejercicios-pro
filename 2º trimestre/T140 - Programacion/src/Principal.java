public class Principal {

    public static void main(String[] args) {



        char[] caracteres = {'H','O','L','A',' ','C','A','R','A','C','O','L','A'};
        String nombre = "HECTORTILLA";
        System.out.println(convertirEnString(caracteres));
        System.out.println(representacionArray(convertirEnArray(nombre)));
    }

    private static char[] convertirEnArray ( String a){
         return a.toCharArray();
    }

    private static String convertirEnString (char[] a){
        return String.valueOf(a);
    }

    private static String representacionArray(char[] array){
        StringBuilder datos = new StringBuilder("Datos de Array = ");
        for (char x:array) {
            datos.append("[").append(x).append("]");
        }
        return String.valueOf(datos);
    }
}

