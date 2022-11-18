package basic_java_questions;

import java.util.HashSet;

public class DuplicateInArray {

    public static void main(String[] args) {

        String[] stringArray = {"java", "C", "C++", "python", "C#"};
        HashSet<String> hashSet = new HashSet<>();
        boolean duplicateFound = false;


        for (String s : stringArray){
            if (hashSet.add(s) == false){
                System.out.println("Duplicate Found!!!");
                duplicateFound = true;
            }
        }

        if(duplicateFound == false){
            System.out.println("No duplicate found!!!");
        }

    }
}
