import java.util.HashMap;

public class Principal {

    public static void main(String[] args){
        System.out.println(calcularFactorial(5));

    }

    private static int calcularFactorial( int numero){
        assert numero >= 0 : String.format("Error: no es posible calcular el factorial de un " +
                "número negativo (n=%d)\n", numero);
        HashMap<Integer, Integer> memoria = new HashMap<>();

        memoria.put(0, 1);
        int aux = 1;
        for (int i = 1; i < numero + 1; i++) {
            memoria.put(i, aux *= i);
        }
        return memoria.get(numero);
    }
}
