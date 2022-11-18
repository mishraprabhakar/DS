package array.leetcode;

public class FinalValueOfVariableAfterPerformingOperations {
    public static void main(String[] args) {
        String[] operations = {"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
    public static int finalValueAfterOperations(String[] operations){
        int X =0;
        for(int i=0; i<operations.length; i++){
            if(operations[i] == "--X"){
                --X;
            }else if (operations[i] == "X--"){
                X--;
            }else if(operations[i] == "++X"){
                ++X;
            }else if(operations[i] == "X++"){
                X++;
            }
        }
        return X;
    }

}
