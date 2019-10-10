public class Principal {

    public static void main(String[] args) {
        int[][] array1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] array2 = {{9,8,7},{6,5,4},{3,2,1}};

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length ; j++) {
                System.out.println(array1[i][j]);
            }
        }

        intercambiarMatrices2(array1, array2);
        System.out.println("");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length ; j++) {
                System.out.println(array1[i][j]);
            }
        }



    }

    public static void intercambiarMatrices(int[][] array1, int[][] array2){
        assert array1[0].length == array2[0].length : "Error debe tener el mismo numero de columnas";
        assert array1.length == array2.length : "Error las dos matrices deben tener el mismo numero de filas";

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                int aux = array1[i][j];
                array1[i][j] = array2[i][j];
                array2[i][j] = aux;
            }
        }
    }

    public static void intercambiarMatrices2(int[][] array1, int[][] array2){
        assert array1[0].length == array2[0].length : "Error debe tener el mismo numero de columnas";
        assert array1.length == array2.length : "Error las dos matrices deben tener el mismo numero de filas";

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = array1[i][j] + array2[i][j];
                array2[i][j] = array1[i][j] - array2[i][j];
                array1[i][j] = array1[i][j] - array2[i][j];
            }
        }
    }

}
