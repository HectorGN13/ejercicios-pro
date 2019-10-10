public class Principal {

    public static void main(String[] args){

        char[] arrayAscendente = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char[] arrayDesordenado = { 'a', 'z', 'f', 'w', 'd', 'h', 'l', 'b'};
        char[] arrayDescendente = {'j', 'i', 'h', 'g', 'f', 'e', 'd', 'c', 'b', 'a'};

        System.out.println(buscarDicotomica(arrayAscendente, 'a'));
        System.out.println(buscarDicotomica(arrayAscendente, 'b'));
        System.out.println(buscarDicotomica(arrayDesordenado, 'a'));
        System.out.println(buscarDicotomica(arrayDesordenado, 'b'));
        System.out.println(buscarDicotomica(arrayDescendente, 'a'));
        System.out.println(buscarDicotomica(arrayDescendente, 'b'));
    }

    public static boolean buscarDicotomica(char[] caracteres, char valorBuscado){
        boolean encontrado = false;
        int izquierda = 0;
        int derecha = caracteres.length-1;
        int mitad= 0;

        while (izquierda<=derecha  &&  !encontrado){
            mitad = (izquierda + derecha) / 2;
            if (caracteres[mitad] == valorBuscado)
                encontrado = true;
            else if (caracteres[mitad] > valorBuscado)
                derecha = mitad -1;
            else
                izquierda = mitad + 1;
        }

        return encontrado;
    }

    //AÑADIR UN METODO QUE SI TE DEVUELVA SI ESTA ORDENADO O NO!
    //Y comprobarlo en el metodo!
}
