package array.interviewquestions;

import java.util.Arrays;

public class ThreeSomeWithTwoPointers {
    public static void main(String[] args) {

        //sum of triplet should equal to zero
        int[] arr = {2, 4, -1, 3, -4, 0, 3};        // -4, -1, 0, 2, 3, 3, 4
        System.out.println(threeSum(arr));
    }

    public static boolean threeSum(int[] a){

        Arrays.sort(a);
        for (int i =0; i<a.length-2; i++){
            if(twoSum(a, -a[i], i+1)){
                return true;
            }
        }
        return false;
    }


    public static boolean twoSum(int[] a, int x, int i){
        int j=a.length-1;

        while (i<j){
            if (a[i] + a[j] < x){
                i++;
            } else if (a[i]+a[j] > x) {
                j--;
            }else{
                return true;
            }
        }
        return false;
    }

}
