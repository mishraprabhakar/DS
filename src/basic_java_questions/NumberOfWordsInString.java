package basic_java_questions;

public class NumberOfWordsInString {

    public static void main(String[] args) {
        String str = "I love java programming";
        int count = 1;

        if (str.length() < 1 || str == " "){
            System.out.println("No words found");
            return;
        }

        for (int i =0; i<str.length()-1; i++){

            if (str.charAt(i)==' ' && str.charAt(i+1) != ' '){
                count++;
            }
        }

        System.out.println("No of words "+count);
    }
}
