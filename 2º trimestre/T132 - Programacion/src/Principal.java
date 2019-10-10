public class Principal {
    public static void main(String[] args){

        int[] array1 = {1, 2, 4, 6, 8, 10};
        int[] array2 = {0, 1, 2, 4, 6, 8, 10, 12};

        System.out.println(buscarDicotomica(array1, 4)); // 1 iteracion
        System.out.println(buscarDicotomica(array1, 8)); //
        System.out.println(buscarDicotomica(array1, 12));
        System.out.println(buscarDicotomica(array2, 4));
        System.out.println(buscarDicotomica(array2, 8));
        System.out.println(buscarDicotomica(array2, 12));

    }



    public static boolean buscarDicotomica(int[] numeros, int valorBuscado){
        boolean encontrado = false;
        int izquierda = 0;
        int derecha = numeros.length-1;
        int mitad;

        while (izquierda<=derecha  &&  !encontrado){
            mitad = (izquierda + derecha) / 2;
            if (numeros[mitad] == valorBuscado)
                encontrado = true;
            else if (numeros[mitad] > valorBuscado)
                derecha = mitad -1;
            else
                izquierda = mitad + 1;
        }

        return encontrado;
    }
}
