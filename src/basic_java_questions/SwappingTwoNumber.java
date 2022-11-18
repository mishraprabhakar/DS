package basic_java_questions;

public class SwappingTwoNumber {
    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 10;

        System.out.println("Before swapping num1 "+num1+" num2 "+num2);

        //Logic 1 Using third variable

        /*int temp = num1;
        num1 = num2;
        num2 = temp;*/

        //Logic 2 Using + & - operator

        /*num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;*/

        //Logic 3 Using * & / operator

        /*num1 = num1*num2;
        num2 = num1/num2;
        num1 = num1/num2;*/

        //Logic 4 Using Bitwise Operator

        /*num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;*/

        //Logic 5 Swapping in single statement

        num2 = num1 - num2+(num1 = num2);


        System.out.println("After swapping num1 "+num1+" num2 "+num2 );
    }
}
