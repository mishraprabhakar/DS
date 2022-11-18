package array.leetcode;

public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        int[] ans = buildArray(arr);
        for (int i: ans) {
            System.out.println(i+" ");
        }
    }

    public static int[] buildArray(int[] array){
        int[] ans = new int[array.length];

        for (int i=0; i<array.length; i++){
            ans[i] = array[array[i]];
        }

        return ans;
    }
}
