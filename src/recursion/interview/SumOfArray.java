package recursion.interview;

public class SumOfArray {

    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6,7,8};

        int sum = sumOfArray(arr, arr.length);
        System.out.println(sum);
    }

    private static int sumOfArray(int[] arr, int length) {

        if (length <= 0){
            return 0;
        }

        return sumOfArray(arr, length-1)+ arr[length-1];

    }

}
