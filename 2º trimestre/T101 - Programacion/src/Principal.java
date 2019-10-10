public class Principal {

    public static void main(String[] args) {
        int[] ejemplo = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int x: ejemplo) {
            System.out.print(x);
        }
        invertirArray(ejemplo);
        System.out.println("");

        for (int x:ejemplo) {
            System.out.print(x);
        }


    }

    public static void invertirArray(int[] array){
        assert array != null : "Error: el array introducido no puede ser nulo.";
        int aux = 0;
        for (int i = 0, j = array.length-1; i < j ; i++, j--) {
            aux = array[i];
            array[i] = array[j];
            array[j] = aux;
        }
    }
}
