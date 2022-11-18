package basic_java_questions;

import java.util.HashMap;
import java.util.Map;

public class CountOccurenceOfAllCharacter {
    public static void main(String[] args) {
        String str = "I love java programming";
        String temp = str.replaceAll("\\s","");
        char[] strChar = temp.toCharArray();

        HashMap<Character, Integer> hashMap = new HashMap();

        for (char c: strChar) {
            if (hashMap.containsKey(c)){
                hashMap.put(c, hashMap.get(c)+1);
            }else{
                hashMap.put(c, 1);
            }

        }

        //This is way to iterate map in JAVA
        for (Map.Entry entry : hashMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
