package rough;

public class PracticeRecursion {



    public static void main(String[] args) {
//        int factorial = factorial(6);
//        System.out.println(factorial);





    }

    public static int fibonacci(int n){

        if (n < 0){
            return -1;
        }

        if (n == 0 || n == 1){
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);

    }

    public static int factorial(int number){

        if (number == 1){
            return 1;
        }

        int num = number*factorial(number -1);

        return num;
    }


}
