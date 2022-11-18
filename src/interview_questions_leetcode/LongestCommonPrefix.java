package interview_questions_leetcode;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = {"cat", "cable", "camera"};
        System.out.println(largestCommonPrefix(strings));
    }


    /*
    *self Approach
    */

    public static String longestCommonPrefix(String[] strings) {

//        ["flower","flow","flight"]

        String tempString = strings[0];     //flower
        String result = "";

        if (strings.length == 1) {
            return tempString;
        }

        for (int i = 1; i < strings.length; i++) {

            for (int j = 0; j < strings[i].length(); j++) {
                if (tempString.charAt(j) == strings[i].charAt(j) && result.length() < tempString.length()
                        && result.length() < strings[i].length()) {
                    result += strings[i].charAt(j);
                } else {
                    return result;
                }
            }
            tempString = result;
            result = "";

        }

        return tempString;

    }

    /*
    *Approach from youtube (best approach)
    */

    public static String largestCommonPrefix(String[] strs) {

        if (strs.length == 0 || strs == null){
            return "";
        }

        String tempWord = strs[0];

        for (int i =0; i<strs.length; i++){

            String currentWord = strs[i];
            int j =0;
            while (j < tempWord.length() && j < currentWord.length() && tempWord.charAt(j) == currentWord.charAt(j)) {
                j++;
            }

            if (j == 0){
                return "";
            }

            tempWord = currentWord.substring(0,j);
        }
        return tempWord;
    }
}
