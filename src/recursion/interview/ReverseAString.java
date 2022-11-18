package recursion.interview;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println(reverse("PRABHAKAR"));
    }
    public static String reverse(String str){
        String result = "";
        if (str.length() == 0){
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);

    }
}
