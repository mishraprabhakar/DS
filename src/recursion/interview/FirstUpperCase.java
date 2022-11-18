package recursion.interview;

public class FirstUpperCase {
    public static void main(String[] args) {
        System.out.println(firstUpperCase("prabhaKar"));
    }

    public static char firstUpperCase(String s) {

        if (Character.isUpperCase(s.charAt(0))){
            return s.charAt(0);
        }

            return firstUpperCase(s.substring(1,s.length()));
    }
}
