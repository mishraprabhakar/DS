package interview_questions_leetcode;

public class LongestPrefixInArray {
    public static void main(String[] args) {
        String[] strings = {"cat", "cable", "camera"};
        System.out.println(commonPrefix(strings));
    }

    public static String commonPrefix(String[] strings){

        if (strings.length == 0 || strings == null){
            return "";
        }

        String tempWord = strings[0];

        for(int i =0; i<strings.length; i++){
            String currentString = strings[i];
            int j =0;

            while ( j < tempWord.length() && j<currentString.length() && tempWord.charAt(j) == currentString.charAt(j)){
                j++;
            }

            if (j <= 0){
                return null;
            }
            tempWord = currentString.substring(0,j);
        }
        return tempWord;
    }
}
