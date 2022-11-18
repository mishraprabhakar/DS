package recursion.interview;

public class ProductOfArray {
    public static void main(String[] args) {
        int[] A = {1, 9, 3, 4, 5};
        int len = A.length;
        System.out.println(product(A, len));
    }
    static int product(int A[], int N){
        if (N <= 0){
            return 1;
        }
        return product(A, N-1)* (A[N-1]);
    }
}
