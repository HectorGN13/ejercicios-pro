import java.util.Random;

public class Principal {

    public static void main(String[] args) {

        int[] array = new int[7];
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(10);
        }

        for (int x:array) {
            System.out.println(x);
        }

        burbuja(array);
        System.out.println("");

        for (int x:array) {
            System.out.println(x);
        }


        //EJEMPLO MANCUERNAS
        System.out.println("");
        System.out.println("EJEMPLOS MANCUERNAS");
        System.out.println("");


        Mancuerna[] mancuernas = new Mancuerna[7];

        for (int i = 0; i < mancuernas.length; i++) {
            mancuernas[i] = new Mancuerna(rnd.nextInt(50));
        }

        for (Mancuerna x:mancuernas) {
            System.out.println(x);
        }

        burbujaObjetos(mancuernas);
        System.out.println("");

        for (Mancuerna x:mancuernas) {
            System.out.println(x);
        }
    }



    public static void burbuja(int[] array){
        for(int i=1;i < array.length;i++){
            for (int j=0 ; j < array.length- 1; j++){
                if (array[j] > array[j+1]){
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
    }
    /**
     * Para implementar el algoritmo de la burbuja para el caso de un array de objeos necesetamos que la clase de dicho array implemente
     * la interface comparable<T>, y modificar a nuestro gusto el metodo compareTo, si no nunca podremos ordenar dicho array.
     * Vamos a ver el ejemplo con la clase Mancuerna.
     */

    public static void burbujaObjetos(Mancuerna[] array){
        for(int i=1;i < array.length;i++){
            for (int j=0 ; j < array.length- 1; j++){
                if (array[j].compareTo(array[j+1]) > 0){
                    Mancuerna aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
    }



}
