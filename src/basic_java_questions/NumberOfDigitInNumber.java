package basic_java_questions;

public class NumberOfDigitInNumber {

    public static void main(String[] args) {
        int num = 1234323565;
        int count =0;
        while (num!=0){
            count++;
            num /= 10;
        }

        System.out.println("Count : "+count );
    }
}
