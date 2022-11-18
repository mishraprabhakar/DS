package basic_java_questions;

public class PalindromeNumber {

    public static void main(String[] args) {
        int number = 1234321;
        int temp = number;
        int rev = 0;

        while (number!=0){
            rev = rev * 10 + number%10;
            number = number/10;
        }


        if (temp == rev){
            System.out.println("It is palindrome number");
        }
        else{
            System.out.println("Not palindrome number");
        }
    }


}
