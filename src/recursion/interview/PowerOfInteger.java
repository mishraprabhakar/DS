package recursion.interview;

public class PowerOfInteger {
    public static void main(String[] args) {
        int result = power(-2, -2);
        System.out.println(result);
    }

    public static int power(int x, int n) {
        if (n < 0){
            return -1;
        }
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }
}
