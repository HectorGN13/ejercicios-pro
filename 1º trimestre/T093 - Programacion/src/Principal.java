public class Principal {
    public static void main(String[] args) {
        System.out.println(masMenos(20));
    }

    private static String masMenos(int n){
        String result = "";
        if (n == 1){
            result += String.valueOf(n);
        }
        for (int i = 1; i <= n; i++) {
            if(i == n){
                result += String.valueOf(i);
            } else {
            result += String.valueOf(i);
                if(i%2 == 0){
                    result += "-";
                } else {
                    result += "+";
                }

            }
        }
        return result;
    }
}
