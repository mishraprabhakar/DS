package basic_java_questions;

import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to reverse :: ");
        int number = sc.nextInt();
        int reverse = 0;

        //Logic 1 Using Algorithm

        /*while (number != 0){
            reverse = reverse * 10 + number%10;
            number = number/10;
        }*/

        //Logic 2 Using StringBuffer

        /*StringBuffer numString = new StringBuffer(String.valueOf(number));
        StringBuffer rev = numString.reverse();

        System.out.println("Reverse Number is ::" + rev);*/

        //Logic 3 Using StringBuilder

        StringBuilder numString = new StringBuilder(String.valueOf(number));

        StringBuilder rev = numString.reverse();

        System.out.println("Reverse Number is ::" + rev);

    }
}
