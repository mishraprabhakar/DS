package basic_java_questions;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;
        while(num != 1){
            fact = fact * num;
            num = num -1;

        }

        System.out.println("Factorial is "+ fact);
    }
}
