public class Diccionario {

    private Palabra[] palabras;
    private static final int MAXPALABRAS = 10;
    private int posicion;

    public Diccionario(int numPalabras) {
        assert numPalabras <= MAXPALABRAS : String.format("Error: no puede tener mas palabras que el maximo de plabras, palabras =%d, maximo de palabras = %d", numPalabras, MAXPALABRAS);
        palabras = new Palabra[numPalabras];

    }
    public void agregar(Palabra palabra){
        assert palabra != null : "Error: la palabra introducida no puede ser null";
        for (int i = 0; i < palabras.length; i++) {
            if (busqueda(palabra))
                assert false : "Error: la palabra ya esta en el diccionario";
        }
        palabras[posicion++] = palabra;
    }

    public void eliminar(Palabra palabra){
        assert palabra != null : "Error la palabra introducida no puede ser null";
        if (busqueda(palabra)){
            for (int i = posicion; i < palabras.length-1; i++) {
                palabras[i] = palabras[i+1];
            }
            palabras[palabras.length-1] = null;
        }
    }

    private boolean busqueda(Palabra palabra){
        boolean result = false;
        for (int i = 0; i < palabras.length; i++) {
            if (palabra.equals(palabras[i])){
                result = true;
                posicion = i;
            }
        }
        return result;
    }

    public Palabra palabra(int posicion){
        if (posicion < 0 || posicion >= palabras.length){
            return null;
        } else {
            return palabras[posicion];
        }
    }

    public void ordenar() {
        for (int i = 1; i < palabras.length; i++) {
            Palabra x = palabras[i];
            int j = i-1;
            while (j >= 0 && x.compareTo(palabras[j]) < 0) {
                palabras[j+1] = palabras[j];
                j = j-1;
            }
            palabras[j+1] = x;
        }
    }

    @Override
    public String toString() {
        String resultado = "";
        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i] == null){
                resultado += String.format("null %n");
            } else {
                resultado += String.format(palabras[i].toString()+"%n");
            }
        }
        return resultado;
    }
}
