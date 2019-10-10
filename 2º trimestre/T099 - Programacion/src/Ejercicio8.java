public class Ejercicio8 {

    public static void main(String []args){
        int[] lista = {1, 4, 6, 7, 8, 11, 12, 16};
        int[] resultado = devolverPares(lista);
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
    }


    public static int[] devolverPares(int[] lista) {
        assert lista != null : "Error el arry no puede ser nulo";

        int total = 0;

        for(int i = 0; i < lista.length; i++){
            if(lista[i] % 2 == 0){
                total++;
            }
        }

        int pares[] = new int[total];
        total = 0;

        for(int i = 0; i < lista.length; i++){
            if(lista[i] % 2 == 0){
                pares[total] = lista[i];
                total++;
            }
        }
        return pares;
    }

}
