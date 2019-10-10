import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        System.out.println(secuenciaDefibonacci(40));
    }

    public static ArrayList<Integer> secuenciaDefibonacci(int iteraciones){
        ArrayList<Integer> secueciaFibonacci= new ArrayList<>();
        for (int i = 0; i < iteraciones; i++) {
            secueciaFibonacci.add(fibonacciRecursivo(i));
        }
        return secueciaFibonacci;
    }

    private static int fibonacciRecursivo(int x){
        if (x <= 1)
            return x;
        else
            return fibonacciRecursivo(x-1) + fibonacciRecursivo(x-2);
    }

}

