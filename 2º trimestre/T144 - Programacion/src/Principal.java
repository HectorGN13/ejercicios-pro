public class Principal {

    public static void main(String[] args) {

        String[][] matriz = {  {"A","B","C","D"},
                               {"E","F","G"},
                               {"H","I"},
                               {"J","K","L","M"}   };


        String[][] matriz2 = {  {"A","B","C"},
                                {"D","E","F"},
                                {"G","H","I"}   };


        mostrarMatrizTraspuesta(matriz);
        System.out.println("");
        mostrarMatrizTraspuesta(matriz2);
    }


    static void mostrarMatrizTraspuesta(String[][] matriz){
        visualizar(transponerMatriz(matriz));
    }

    static String[][] transponerMatriz(String[][] original){
        String[][] result = new String[original[0].length][original.length];
        for(int i=0;i<original.length;i++){
            for(int j=0;j<original[i].length;j++){
                result[j][i] = original[i][j];
            }
        }
        return result;
    }

    private static void visualizar(String[][] matriz){
        for (String[] x : matriz) {
            for (int j = 0; j < x.length; j++) {
                if (x[j] != null)
                    System.out.print("[" + x[j] + "]" + "\t");
            }
            System.out.println();
        }
    }
}
