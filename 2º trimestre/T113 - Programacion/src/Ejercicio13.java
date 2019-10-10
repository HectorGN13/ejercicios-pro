public class Ejercicio13 {

        public static void main(String[] args) {

            int array[] = {1,3,5,7,9,11};
            System.out.println(buscarLineal(array, 11));

        }

        public static int buscarLineal(int[] numeros, int valorBuscado) {
            assert numeros != null : "Error: el array introducido no puede ser null";
            int posicion = -1;
            int i = 0;
            while (i < numeros.length && posicion == -1)
                if (numeros[i] == valorBuscado)
                    posicion = i;
                else
                    i++;
            return posicion;
        }
}
