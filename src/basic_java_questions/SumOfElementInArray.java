package basic_java_questions;

public class SumOfElementInArray {
    public static void main(String[] args) {

        int[] intArray = {1,3,2,4,5,4};
        int sum =0;

        for (int i =0; i<intArray.length; i++){
            sum = sum + intArray[i];
        }
        System.out.println("Sum of Element in Array will be : "+ sum);

    }
}
