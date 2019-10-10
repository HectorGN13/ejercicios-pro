public class Principal {

    public static void main(String []args){
        char[] ejemplo = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        rotarDerecha(ejemplo,5);
        for (char x: ejemplo) {
            System.out.println(x);
        }
    }

    public static void rotarDerecha (char[] caracteres, int n){
        assert caracteres != null : "Error el array no puede ser nulo.";
        assert caracteres.length >= 1 : "Error: la longuitud del array introducido tiene que ser mayor que 0";
        for (int j = 0; j < n; j++) {
            char aux = caracteres[caracteres.length-1];
            for (int i = caracteres.length - 1; i > 0; i--) {
                caracteres[i] = caracteres[i - 1];
            }
            caracteres[0] = aux;
        }
    }
}
