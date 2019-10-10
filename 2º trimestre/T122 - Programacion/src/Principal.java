public class Principal {

    public static void main(String[] args) {
        String[] strings = {"hola","caracola","a","cabeza"};
        ordenarInsercionDirecta(strings);
        for (String x:strings) {
            System.out.println(x);
        }
    }

    public static void ordenarInsercionDirecta(String[] array){
        assert array != null : "Error el array introducido no puede ser null";
        String aux;
        int j;
        for(int i = 1; i < array.length; i++){
            aux = array[i];
            j=i-1;

            while(j >= 0 && array[j].compareTo(aux) > 0){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = aux;
        }
    }

}
