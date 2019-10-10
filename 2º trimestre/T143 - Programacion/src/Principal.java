import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {


        int[][] arraybi = {{2,3,4,5,6},{1,2,3,4},{2,2,2,3,4,5,6,7,8}};
        System.out.println(calcularFilaMayor(arraybi));

    }


    public static int calcularFilaMayor(int[][] arrayBidimensional){
        assert arrayBidimensional != null : "Error: no puedes pasar un parametro nulo.";
        int[] result = arrayBidimensional[0];
        for (int i = 0; i < arrayBidimensional.length; i++) {
            if (result.length < arrayBidimensional[i].length)
                result = arrayBidimensional[i];
        }
        return result.length;
    }
}
