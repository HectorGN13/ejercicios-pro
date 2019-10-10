public class Principal {

    public static void main(String[] args) {

        int[] ejemplo= {1,3,5,12,16,18};
        System.out.println(estaOrdenada(ejemplo));
    }


    public static boolean estaOrdenada(int[] enterosArray){
        assert enterosArray != null : "Error...";
        assert enterosArray.length > 1 : "Error el array introducido ya esta ordenado";
        assert enterosArray.length != 0 : "Error el array introducido no puede estar vacio";

        boolean result = false;
        for (int j = 0; j < enterosArray.length; j++) {
        for (int i = 1; i < enterosArray.length -1; i++) {
            result = enterosArray[j] < enterosArray[j+i];
        }
        }
        return result;

    }
}
