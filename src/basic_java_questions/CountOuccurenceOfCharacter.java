package basic_java_questions;

import java.util.HashMap;
import java.util.Map;

public class CountOuccurenceOfCharacter {
    public static void main(String[] args) {
        String str = "I love java programming";

        occurrenceOfAllCharacter(str);

    }
    public static void occurrenceOfAllCharacter(String str){

        HashMap<Character, Integer> hashMap = new HashMap<>();

        String temp = str.replaceAll("\\s", "");

        char[] characters = temp.toCharArray();

        for (Character c : characters) {
            if (hashMap.containsKey(c)){
                hashMap.put(c, hashMap.get(c)+1);
            }
            else hashMap.put(c,1);
        }


        for (Map.Entry e: hashMap.entrySet()) {
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }

}
