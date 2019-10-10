public class Principal {


    public static void main(String[] args) {

        int[] array = {5,15,-12,3,1,-1};
        ordenarInsercionDirecta(array);
        for (int x:array) {
            System.out.println(x);
        }
    }


    public static void ordenarInsercionDirecta(int[] array) {

        int aux, j;
        for ( int i = 1; i < array.length; i++)  {
            aux = array[i];
            j = i-1;

            while (j >= 0 && array[j] > aux)   {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = aux;
        }
    }
}
/* El for recoge desde el primer elemento hasta el final,
   va guardando el elemento en el aux, en el siguiente paso se le asigna a j la posicion del anterior
   y en el while se comprueba con el anterior (mientras vallan quedando posiciones)
   que el valor del auxiliar sea menor que el de la izquierda, si es correcto se va desplazando a la derecha.
   en la ultima linea el auxiliar va quedando en su lugar.

   en definitiva es como si los menores fueran empujando a los ordenados.
 */