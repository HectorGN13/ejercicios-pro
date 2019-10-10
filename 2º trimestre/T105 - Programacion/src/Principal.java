public class Principal {

    public static void main(String []args){
        char ejemplo[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        rotarIzquierda(ejemplo, 4, '*');

        for (char x:ejemplo) {
            System.out.print(x);
        }


    }


    private static void rotarIzquierda(char[] array, char caracter){
        assert array != null : "Error:el array introducido no puede ser null";
        assert array.length >= 1  : "Error: el array introducido tiene que tener como minimo longitud 1";

        for(int i = 0; i < array.length-1; i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = caracter;
    }


    public static void rotarIzquierda(char[] array, int n, char caracter){
        assert n > 0 : "Error: tienes que pasarle un 1 como minimo";

        for (int i = 0; i < n; i++){
            rotarIzquierda(array,caracter);
        }
    }
}
