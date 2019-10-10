public class Principal{

    public static void main(String[] args) {
        System.out.println(sumar(4,5,6,7,8,10));
    }

    public static int sumar(int... nums) {
        int total = 0;

        for (int i=0 ; i < nums.length ; i++) {
            total += nums[i];
        }

        return total;
    }
}
