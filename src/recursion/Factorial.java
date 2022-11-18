package recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(17));
    }

    public static long fact(int n){
        long result =0;
        if (n < 0){
            return -1;
        }
        if (n==0){
            return 1;
        }

        else {
            result = n * fact( n-1);
            return result;
        }
    }
}

