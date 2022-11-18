package array.interviewquestions;

public class MaxProductOfTwoInteger {
    public static void main(String[] args) {
        int[] a = {10,80,30,40,50};


        System.out.println(maxProduct(a));
    }

    public static Integer maxProduct(int[] a){
        Integer result = 0;
        int max = 80, i;
        for ( i=0; i<a.length-1; i++){
            if (max*a[i] < max*a[i+1]){
                result = max*a[i+1];
            }else{
                result = max*a[i];
            }
        }
        return result;
    }

}
