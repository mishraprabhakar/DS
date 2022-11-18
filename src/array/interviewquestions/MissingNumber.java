package array.interviewquestions;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 8, 9, 10};
        System.out.println(missingNum(arr));


    }
    public static int missingNum(int[] intArray){
        int expected = 10 * 11/2;
        int actual = 0;
        for (int i=0; i<intArray.length; i++){
            actual += intArray[i];
        }
        return expected-actual;
    }
}
