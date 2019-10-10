import java.util.ArrayList;

public class Util {

    private Util() {
    }

    public static ArrayList<Integer> obtenerPares(int desde, int hasta) throws ExcepcionRangoInvalido {

        if (desde > hasta)
            throw new ExcepcionRangoInvalido("Error: el rango de numeros no es valido");

        ArrayList<Integer> pares = new ArrayList<>();

        for (int i = desde; i <= hasta ; i++) {
            if (i%2==0)
                pares.add(i);
        }

        return pares;
    }

    public static String[] cambiarMayus (String cadena){
        if (cadena== null)
            throw new NullPointerException("Error: la frase o palabra recibida no puede ser nulo");
        if (cadena.isEmpty())
            throw new IllegalArgumentException("Error: la frase o palabra no puede estar vacía");
        if (cadena.length()<=1)
            throw new ExcepcionLongitudInvalida("Error: La palabra recibida debe tener mas de un caracter");

        String[] array = cadena.split(" ");
        String[] resultado = new String[array.length];
        String pal;

        for (int i = 0; i < array.length ; i++) {

            for (int j = 0; j <array[0].length() ; j++) {
                pal= array[i].toUpperCase().charAt(0)+array[i].substring(1);
                resultado[i] = pal;
            }

        }

        return resultado;

    }
}
