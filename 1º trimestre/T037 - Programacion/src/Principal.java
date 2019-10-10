public class Principal {

    public static void main(String[] args) {
    Double a;

        int a = 1;
        int b = 5;

        if( a == 1 || b++ < 10 ) {
            System.out.println("Se ha producido el cortocircuito. ;)");
        }
        System.out.println("b = " + b );

        if( a != 1 || b++ < 10 ) {
            System.out.println("No se ha producido el cortocircuito. :(");

        }
        System.out.println("b = " + b );
    }
}
