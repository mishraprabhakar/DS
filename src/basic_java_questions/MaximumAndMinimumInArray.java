package basic_java_questions;

public class MaximumAndMinimumInArray {
    public static void main(String[] args) {
        int[] intArray = {1,3,2,4,5,4};
        int max = intArray[0];
        int min = intArray[0];


        for (int i : intArray) {
            if (max < i){
                max = i;
            }
            if (min > i ){
                min = i;
            }
        }

        System.out.println("Maximum value is "+max+" Minimum value is "+min);
    }


}
