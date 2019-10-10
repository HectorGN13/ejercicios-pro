import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        System.out.println(secuenciaDefibonacci(40));

    }

    public static ArrayList<Integer> secuenciaDefibonacci(int iteraciones){
        ArrayList<Integer> secueciaFibonacci= new ArrayList<>();
        for (int i = 0; i < iteraciones; i++) {
            secueciaFibonacci.add(fibonacciIterativo(i));
        }
        return secueciaFibonacci;
    }

    private static int fibonacciIterativo(int iteraciones) {
        if(iteraciones <= 1) {
            return iteraciones;
        }
        int result = 1;
        int anterior = 1;

        for(int i=2; i< iteraciones; i++) {
            int aux = result;
            result+= anterior;
            anterior = aux;
        }
        return result;
    }

}
