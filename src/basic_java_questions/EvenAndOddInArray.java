package basic_java_questions;

public class EvenAndOddInArray {

    public static void main(String[] args) {

        int[] intArray = {1,3,2,4,5,4};
        int evenCount = 0;
        int oddCount = 0;

        for (int i : intArray) {
            if (i%2==0){
                evenCount++;
            }else {
                oddCount++;
            }
        }

        System.out.println("Even Count : "+evenCount+" odd Count "+ oddCount);

    }
}
