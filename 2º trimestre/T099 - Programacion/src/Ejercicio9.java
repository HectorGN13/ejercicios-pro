public class Ejercicio9 {
    
    public static void main(String []args){
        int[] ejemplo = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        rotarDerecha(ejemplo);
        rotarDerecha(ejemplo);
        rotarDerecha(ejemplo);
        for (int x: ejemplo) {
            System.out.println(x);
        }
    }

    public static void rotarDerecha (int [] numeros){
        assert numeros != null : "Error el array no puede ser nulo.";
        int aux;
        aux = numeros[numeros.length-1];
        for(int i = numeros.length-1; i > 0; i--){
            numeros[i] = numeros[i-1];
        }
        numeros[0] = aux;
    }
}
