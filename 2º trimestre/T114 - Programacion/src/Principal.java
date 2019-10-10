public class Principal {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int[] resultado = devolverNumerosPrimos(array, new Rango(0, 15));

        //int[] ejemplo = new int[0];

        //int[] resultado = devolverNumerosPrimos(ejemplo, new Rango(0,0));

        for (int i = 0; i < resultado.length ; i++) {
            System.out.println(resultado[i]);
        }
    }

    public static int[] devolverNumerosPrimos(  int[] arrayIntroducido, Rango rango){
        assert rango.getInicio() >=0 : "Error el primer valor del rango tiene que ser mayor o igual que 0";
        assert rango.getInicio() < rango.getFin() : "Error el primer valor del rango tiene que ser menor que el segundo";
        assert rango.getInicio() < arrayIntroducido.length && rango.getFin() <= arrayIntroducido.length : String.format("Error, los valores tienen que estar comprendidos dentro de la longuitud del array (%d)", arrayIntroducido.length);


        if(arrayIntroducido.length == 0 || arrayIntroducido == null){
            int[] array = new int[0];
            return array;
        }


        int contador = 0;

        for (int k = rango.getInicio(); k <= rango.getFin(); k++) {
            if(esPrimo(arrayIntroducido[k])){
                contador++;
            }
        }
        int[] arrayPrimos = new int[contador];

        for (int k = rango.getInicio(), x = 0; k <= rango.getFin(); k++) {
            if(esPrimo(arrayIntroducido[k])){
                arrayPrimos[x] = arrayIntroducido[k];
                x++;
            }
        }

        return arrayPrimos;
    }

    private static boolean esPrimo(int numero){
        int aux;
        for(int i=2; i<numero; i++) {
            aux = numero % i;
            if(aux==0){
                return false;
            }
        }
        return true;
    }
}
