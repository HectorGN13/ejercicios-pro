public class Principal {

    public static void main(String[] args) {
        System.out.println(esVocal('a'));
        System.out.println(esVocal('E'));
        System.out.println(esVocal('i'));
        System.out.println(esVocal('O'));
        System.out.println(esVocal('u'));

        System.out.println(esVocal('c'));
        System.out.println(esVocal('C'));
    }
//
    private static boolean esVocal(char a){
        return "aeiouAEIOU".contains(String.valueOf(a));
    }

//    private static boolean esVocal(char a){
//        boolean resultado;
//        switch (a){
//            case 'a': case 'A': case 'e': case 'E': case 'i': case 'I': case 'o': case 'O': case 'u': case 'U':
//                resultado = true;
//                break;
//            default:
//                resultado = false;
//                break;
//        }
//        return resultado;
//    }

//        private static boolean esVocal(char r){
//            if(r=='a'||r=='e'||r=='i'||r=='o'||r=='u'||r=='A'||r=='E'||r=='I'||r=='O'||r=='U') {
//                return true;
//            }
//            return false;
//        }

}
