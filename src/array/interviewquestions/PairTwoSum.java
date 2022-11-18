package array.interviewquestions;

import java.util.Arrays;

public class PairTwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4};
        int[] result = twoSum(arr, 6);
        System.out.println(Arrays.toString(result));
    }

    //Two pointers algorithm
    public static int[] twoSum(int[] arr, int target){

        int[] result = new int[2];
        int i =0, j= arr.length-1;
        Arrays.sort(arr);

        while (i<j){
            if (arr[i] + arr[j] < target){
                i++;
            } else if (arr[i] + arr[j] > target) {
                j--;
            }else
            {
                result[0] = i;
                result[1] = j;
                return result;
            }
        }


        throw new IllegalArgumentException("No Solution found!!");

    }
}
