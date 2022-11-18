package recursion.interview;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("prabhakar"));
    }
//    public static boolean isPalindrome(String s){
//        if (s.equals(reverse(s))){
//            return true;
//        }
//        return false;
//    }

    public static String reverse(String s){
        if (s.length() == 0){
            return s;
        }
        return s.charAt(s.length()-1) + reverse(s.substring(0, s.length()-1));
    }

    //Alternative Method
    public static boolean isPalindrome(String s){
        if (s.length() ==0 || s.length() == 1){
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length()-1)){
            return isPalindrome(s.substring(1, s.length()-1));
        }
        return false;
    }
}
