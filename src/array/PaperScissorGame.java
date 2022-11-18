package array;

import java.util.Scanner;

public class PaperScissorGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        PaperScissorGame.whoIsWinner(input1, input2);
    }

    public static void whoIsWinner(String input1, String input2){

        if((input1.equalsIgnoreCase("Rock") &&
                input2.equalsIgnoreCase("Scissors")) ||
                (input2.equalsIgnoreCase("Rock") &&
                        input1.equalsIgnoreCase("Scissors"))){
            System.out.println("Rock beats scissors");
        }else if((input1.equalsIgnoreCase("Scissors") &&
                input2.equalsIgnoreCase("Paper")) ||
                (input2.equalsIgnoreCase("Scissors") &&
                        input1.equalsIgnoreCase("Paper"))){
            System.out.println("Scissors beats paper");
        }else if((input1.equalsIgnoreCase("Paper") &&
                input2.equalsIgnoreCase("Rock")) ||
                (input2.equalsIgnoreCase("Paper")&&
                        input1.equalsIgnoreCase("Rock"))){
            System.out.println("Paper beats Rock");
        }else if(input1.equalsIgnoreCase(input2)){
            System.out.println("Tie");
        }

    }
}
