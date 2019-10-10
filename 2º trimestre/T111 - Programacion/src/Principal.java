public class Principal {

    public static void main (String[] args){

        int array[] = {1, 22, 3, 44, 5 ,66, 7, 88, 9, 00, 11, 22};
        int resultado[] = buscarLineal2( array, 22);

        for(int i = 0; i < resultado.length; i++){
            System.out.println(resultado[i]);
        }
    }


    public static int[] buscarLineal2(int[] numeros, int valorBuscado1){
        assert numeros != null : "Error: no puedes introducir un array null";
        int x = 0;
        for(int i = 0; i<numeros.length ; i++) {
            if (numeros[i] == valorBuscado1){
                x++;
            }
        }
        int i = 0;
        int e = 0;
        int[] arrayPosiciones = new int[x];
        while (i < numeros.length) {
            if (numeros[i] == valorBuscado1) {
                arrayPosiciones[e] = i;
                e++;
                i++;
            } else i++;
        }
        return arrayPosiciones;
    }
}
