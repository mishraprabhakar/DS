package basic_java_questions;

public class PrimeNumber {
    public static void main(String[] args) {

        int num = 3421;
        int count = 0;
        if (num > 1){
            for (int i =1; i<=num; i++){
                if (num % i == 0){
                    count++;
                }
            }
            if (count == 2){
                System.out.println("It is prime number");
            }else {
                System.out.println("It is not prime number");
            }
        }
        else{
            System.out.println("Number should be greater than 1");
        }

    }
}
