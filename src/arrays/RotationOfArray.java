package arrays;

public class RotationOfArray {

    public static void main(String[] args) {

        //Input --> 1, 2, 3, 4, 5, 6, 7
        //k --> 3
        //Output --> 4 5 6 7 1 2 3

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int k = 3;

//        int[] answer = rotateArrayOneByOne(arr, k);
//        int[] answer = rotate(arr, k);

//        for (int i : answer) {
//            System.out.print(i + " ");
//        }

        rotateArrayTwoTimes(arr, 3);

    }

    //Approach 1
    private static int[] rotateArrayOneByOne(int[] arr, int k) {

        for (int i = 0; i < arr.length-k; i++) {
            helper(arr);
        }
        return arr;

    }

    private static void helper(int[] arr) {

        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = temp;

    }

    //Approach 2

    private static int[] rotate(int[] arr, int k){

        int[] answer = new int[arr.length];

        for (int i =0; i<k; i++){
            answer[i] = arr[arr.length-k+i];
        }

        int j =0;

        for (int i =k; i< arr.length; i++){

            answer[i] = arr[j];
            j++;
        }

        return answer;

    }

    //Best Approach
    /*
    * Step 1 : 1 2 3 4 5 6 7 --> apply reverse from 0 to n-k and n-k to n
    * Step 2 : 4 3 2 1 7 6 5 --> apply reverse from 0 to n
    * Answer : 5 6 7 1 2 3 4
    */

    private static void rotateArrayTwoTimes(int[] arr, int k){

        reverse(0, arr.length-k-1, arr);
        reverse(arr.length-k, arr.length-1, arr);
        int[] reverseValue = reverse(0, arr.length - 1, arr);
        for (int i: reverseValue) {
            System.out.print(i+" ");
        }


    }

    private static int[] reverse(int i, int j, int[] arr){


        while (i < j){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return arr;
    }


}
