public class IfElse2 {
    static int test(int testval, int target) {
        if (testval > target)
            return +1;
        else if (testval < target)
            return -1;
        else
            return 0; // Match
    }

    public static void main(String[] args) {
        Print.print(test(10, 5));

        Print.print(test(5, 10));

        Print.print(test(5, 5));
    }
}