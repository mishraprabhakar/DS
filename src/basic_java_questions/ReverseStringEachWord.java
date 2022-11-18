package basic_java_questions;

public class ReverseStringEachWord {
    public static void main(String[] args) {

        String str = "I love Java Language";

        String[] strings = str.split(" \\s");


        for (int i = strings.length; i <= 0 ; i--) {
            System.out.println(strings[i]);
        }


        System.out.println();
    }
}
