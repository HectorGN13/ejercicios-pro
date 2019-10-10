public class Principal {

    public static void main(String[] args) {
        System.out.println(max4(10,20,33,19));
    }

    private static int max4(int a, int b, int c, int d){
        return Math.max(Math.max(a,b),Math.max(c,d)) ;
    }
}
