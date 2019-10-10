import java.util.Random;

public class Ejercicio11 {

    public static void main(String []args){
        int[] lista = frecuencias(5);
        for (int x:lista) {
            System.out.println(x);
        }
   
    }

    public static int[] frecuencias(int n){
        int[] frecuencias = new int[n];
        int[] aleatorios = new int[100];
        Random rnd = new Random();
        int contador = 0;

        for (int i = 0; i < aleatorios.length; i++) {
            aleatorios[i] = rnd.nextInt(n);
        }

        for (int i = 0; i < frecuencias.length; i++) {
            for (int j = 0; j < aleatorios.length; j++) {
            if (aleatorios[j] == i)
            contador++;
            }
            frecuencias[i]=contador;
            contador=0;
        }

        return frecuencias;
    }


}
