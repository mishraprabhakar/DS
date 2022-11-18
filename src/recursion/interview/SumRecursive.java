package recursion.interview;

public class SumRecursive {
    public static void main(String[] args) {
        int[] arr ={2, 4, 6};
        OddFunction oddFunction = new OddFunction();
        System.out.println(sumRecursive(arr, oddFunction));
    }

    public static boolean sumRecursive(int[] A, OddFunction oddFunction){
        if (A.length == 0){
            return false;
        } else if (oddFunction.run(A[0]) == false) {
            return false;
        }
        return true;
    }

}
