public class Principal {
    public static void main(String[] args) {

        trianguloPascal(4);

    }


    private static void trianguloPascal(int n){

        for (int i = 0; i < n; i++) {
            int variable = 1;
            for (int j = n ; j > i ; j--) {
                System.out.print(" ");
            }
            for (int k = 0 ; k <= i ; k++) {
                System.out.print(variable + " ");
                variable = variable*(i - k) / (k+ 1);
            }
            System.out.println("");
        }
    }
}
