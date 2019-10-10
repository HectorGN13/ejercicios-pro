public class Ejercicio7 {

    public static void main(String [] args){
        int[] valores = {1, 3, 5, 0, 9, 11, 16, 7, 30};
        System.out.println(valorMax(valores));

    }

    public static int valorMax(int[] valores) {
        int max = valores[0];
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > valores[max]) {
                max = i;
            }
        }
        return valores[max];
    }
}
