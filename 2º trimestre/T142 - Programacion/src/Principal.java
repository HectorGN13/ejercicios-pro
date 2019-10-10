import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {


        int[] array = { 4, 3, 2, 40, 10};
        System.out.println("Array desordenado\n" + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Array ordenado\n" + Arrays.toString(array));
        System.out.println(
                 " El 10 está en la posición " + Arrays.binarySearch(array, 10));
        Arrays.fill(array, 10);
        System.out.println("Array rellenado con 10\n" + Arrays.toString(array));
    }
}
