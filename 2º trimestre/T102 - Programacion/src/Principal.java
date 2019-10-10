public class Principal {


    public static void main(String []args){
        char[] ejemplo = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        rotarDerecha(ejemplo);
        rotarDerecha(ejemplo);
        rotarDerecha(ejemplo);
        for (char x: ejemplo) {
            System.out.print(x);
        }
    }

    public static void rotarDerecha (char[] caracteres){
        assert caracteres != null : "Error el array no puede ser nulo.";
        assert caracteres.length >= 1 : "Error: el array tiene que ser mayor que 0";
        char aux = caracteres[caracteres.length-1];
        for (int i = caracteres.length - 1; i > 0; i--) {
                caracteres[i] = caracteres[i - 1];
        }
        caracteres[0] = aux;
    }


}
