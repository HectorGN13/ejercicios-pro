public class Principal {

    public static void main(String[] args) {

        System.out.println(contar('A', "ANACARDO",'C'));  //-> 2
        System.out.println(contar('O',"EDUARDO",'R')); //-> 0
        System.out.println(contar('T',"PATATA",'A')); //-> 0
        System.out.println(contar('E',"MELONES",'N')); //-> 1
    }

    private static int contar(char caracter, String frase, char maldito){
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
                if(frase.charAt(i) == caracter){
                    contador++;
                    continue;
                } else if (frase.charAt(i) == maldito)
                    break;
        }
        return contador;
    }
}
