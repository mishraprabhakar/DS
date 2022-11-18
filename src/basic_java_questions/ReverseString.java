package basic_java_questions;

public class ReverseString {
    public static void main(String[] args) {
        String string = "Welcome";
        String reverse = "";

        //Logic 1 Using concatenation operator

        /*for (int i = string.length()-1; i>=0; i--){
            reverse += string.charAt(i);
        }*/


        //Logic 2 Using Character Array

        /*char[] charArray = string.toCharArray();

        for (int i= charArray.length-1; i>=0; i--){
            reverse += charArray[i];
        }*/

        //Using String Buffer
        StringBuffer stringBuffer = new StringBuffer(string);


        System.out.println(stringBuffer.reverse());
    }
}
