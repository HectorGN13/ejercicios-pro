public class Principal {

    public static void main(String[] args) {

        System.out.println(contar('A', "ANACARDO",'C'));  //-> 1
        System.out.println(contar('O',"EDUARDO",'R')); //-> 1
        System.out.println(contar('T',"PATATA",'A')); //-> 2
        System.out.println(contar('E',"MELONES",'N')); //-> 1
        System.out.println(contar('N',"ANFITRION", 'A')); //-> 2
    }

    private static int contar(char caracter, String frase, char maldito){
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == maldito){
                for (int j = i+1; j < frase.length(); j++) {
                    if (frase.charAt(j) == caracter){
                        contador++;
                    }
                }
                break;
            }
        }
        return contador;
    }
}