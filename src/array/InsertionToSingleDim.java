package array;

public class InsertionToSingleDim {

    int[] intArray = null;

    public InsertionToSingleDim(){
        intArray = new int[4];
        for (int i =0; i < intArray.length; i++){
            intArray[i] = Integer.MIN_VALUE;
        }
    }

    public void insertValue(int location, int value){
        try {
            if (intArray[location] == Integer.MIN_VALUE){
                intArray[location] = value;
                System.out.println("Successfully Inserted!!!");
            }else {
                System.out.println("location is already occupied!!!");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid to index to access collections.array!!!");
        }
    }


    public static void main(String[] args) {
        InsertionToSingleDim obj = new InsertionToSingleDim();
        obj.insertValue(0,0);
        obj.insertValue(1,10);
        obj.insertValue(2,20);
        obj.insertValue(3,40);
        obj.insertValue(1,30);
        obj.insertValue(10,220);
    }
}
