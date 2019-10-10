public class Principal {

    public static void main(String[] args) {
        a(20);
    }

        private static void a ( int parametroA){
            System.out.println(b(parametroA));;
        }

        private static int b ( int parametroB){
            return c(--parametroB);
        }

        private static int c ( int parametroC){

            return --parametroC;
        }


}
