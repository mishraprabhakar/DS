package arrays;

import java.util.List;
import java.util.Stack;

public class ReversePolishNotation {

//    [2, 1, + , 3 , *]

    public static void main(String[] args) {

        List<String> list = List.of("2", "1", "+", "3", "*");


        Stack<Integer> integers = evaluateRPN(list);
        System.out.println(integers);
    }

    private static Stack<Integer> evaluateRPN(List<String> list) {

        Stack<Integer> stack = new Stack<>();

        for (String s : list) {

            if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int i = stack.pop();
                int j = stack.pop();

                if (s.equals("+")){
                    int ans = i+j;
                    stack.push(ans);
                }

                if (s.equals("-")){
                    int ans = j-i;
                    stack.push(ans);
                }

                if (s.equals("*")){
                    int ans = i*j;
                    stack.push(ans);
                }

                if (s.equals("/")){
                    int ans = j/i;
                    stack.push(ans);
                }



            }
            else {
                int num = Integer.parseInt(s);
                stack.push(num);

            }

        }

        return stack;
    }

}
