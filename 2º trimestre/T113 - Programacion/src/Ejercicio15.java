public class Ejercicio15 {

    public static void main(String[] args) {

        int[][] ejemplo = matrizIdentidad(8);

        for (int i = 0; i < ejemplo.length; i++) {
            for (int j = 0; j < ejemplo[i].length; j++)
                System.out.print(ejemplo[i][j]);
            System.out.println(" ");
        }
    }

    public static int[][] matrizIdentidad(int dimension){
        int[][] result = new int[dimension][dimension];
        for (int i = 0; i < result.length; i++)
            for (int j = 0; j < result.length; j++)
                    result[i][i] = 1;
        return result;
    }

}
