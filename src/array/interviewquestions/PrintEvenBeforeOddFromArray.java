package array.interviewquestions;

public class PrintEvenBeforeOddFromArray {

    public static void main(String[] args) {

        int[] arr = {2,3,5,4,7,8,10};

        PrintEvenBeforeOddFromArray.printEvenBeforeOdd(arr);
    }

    public static void printEvenBeforeOdd(int[] arr){

        int[] result = new int[arr.length];


        int index = 0;
        for (int i=0; i< arr.length; i++){

            if (arr[i] % 2==0){
                result[index] = arr[i];
                index++;
            }
        }

        for (int i=0; i< arr.length; i++){

            if (arr[i] % 2 !=0){
                result[index] = arr[i];
                index++;
            }
        }

        for (int i : result) {
            System.out.println(i);
        }



    }
}
