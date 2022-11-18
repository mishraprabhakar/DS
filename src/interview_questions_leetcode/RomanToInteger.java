package interview_questions_leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInteger("VIII"));
    }

    public static int romanToInteger(String s){

        Map<Character, Integer> characterIntegerMap = new HashMap<>();
        characterIntegerMap.put('I' , 1);
        characterIntegerMap.put('V' , 5);
        characterIntegerMap.put('X' , 10);
        characterIntegerMap.put('L' , 50);
        characterIntegerMap.put('C' , 100);
        characterIntegerMap.put('D' , 500);
        characterIntegerMap.put('M' , 1000);

        int result = 0;

        for (int i =0; i< s.length()-1; i++){
            if (characterIntegerMap.get(s.charAt(i)) >= characterIntegerMap.get(s.charAt(i+1))){
                result = result + characterIntegerMap.get(s.charAt(i));
            } else {
                result = result - characterIntegerMap.get(s.charAt(i));
            }
        }
        result = result + characterIntegerMap.get(s.charAt(s.length()-1));

        return result;
    }
}
