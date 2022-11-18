package array.leetcode;

public class ConcatenationOfArray {
    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        int[] ans = getConcatenation(arr);
        for (int i: ans) {
            System.out.println(i + " ");
        }

    }

    public static int[] getConcatenation(int[] array){
        int[] ans = new int[2 * array.length];
        int n = array.length;
        for (int i=0; i<array.length; i++){
            ans[i] = array[i];
            ans[i+n] = array[i];
        }
        return ans;
    }
}
