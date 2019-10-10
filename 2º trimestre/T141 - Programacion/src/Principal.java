import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        int numero = 125;
        int numeros[] = {0, 4, 6, 12, 20, 28, 31, 39, 55, 61, 78, 100, 125, 240, 322,  478, 540, 678};
        boolean numeroCorrecto = false;

        for (int i = 0; i < numeros.length; i++) {
            if (numero == numeros[i]) {
                System.out.println("El numero " + numero + " se encuentra en la posicion " + Arrays.binarySearch(numeros, numero));
                numeroCorrecto = true;
            }
        }

        if (numeroCorrecto == false) {
            System.out.println("El numero no esta dentro del Array");
        }
    }
}
