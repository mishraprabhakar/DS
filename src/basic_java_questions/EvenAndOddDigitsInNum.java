package basic_java_questions;

public class EvenAndOddDigitsInNum {
    public static void main(String[] args) {
        int num = 324576849;
        int evenCount = 0;
        int oddCount = 0;

        while (num != 0){
            int digit = num % 10;
            if(digit%2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
            num /= 10;

        }

        System.out.println("Number of even digit "+evenCount+ " number of odd digit "+ oddCount);
    }
}
