public class Principal {

    static char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

    public static void main(String[] args) {
        System.out.println(letraDni(49042468));
    }

    public static String letraDni(int dni){
        assert dni >= 10000000 && dni <= 99999999 : "Error el numero introducido debe tener 8 cifras";
        return String.valueOf(dni)+"-"+ letras[dni % 23];
    }
}
