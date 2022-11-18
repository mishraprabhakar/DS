package basic_java_questions;

import java.util.Scanner;

public class FibonacciNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to print the fib :: ");
        int num = sc.nextInt();

        int firstDigit = 0;
        int secondDigit = 1;
        System.out.print(firstDigit+" "+secondDigit+" ");

        while (num != 0){

            int sum = firstDigit + secondDigit;
            firstDigit = secondDigit;
            secondDigit = sum;
            System.out.print(sum+" ");
            num--;
        }
    }
}
