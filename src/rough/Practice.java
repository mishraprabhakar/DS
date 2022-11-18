package rough;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice {

    public static void main(String[] args) {

        String str = "I love java programming";

        int num = 324576849;

        int forFactorial = 0;

        int toPrintFibonacci = 10;

        int[] intArray = {1, 3, 2, 4, 5, 4};

        int countOfDigits = 1234323565;

        String numberOfWords = "I love java programming";

        int palindromeOrNot = 1234321;

        int primeNumOrNot = 9973;

        String strWithSpecialChar = "fiajOJOSDOOJN3#$&(&^<>:(%)";

        String reversStr = "Welcome";

        String trimString = "I love India and India is great country I love a india from deep of my heart";

        int[] arr = {3, 2, 4};

        int[] result = twoSum(arr, 6);

        for (int i : result) {
            System.out.println(i+ " ");
        }

//        showOccurrenceOfCharacter(str);
//        showOccurrenceOfCharacter(str, "a");
//        numberOfDigitsInNumber(num);
//        factorial(forFactorial);
//        printFibonacci(toPrintFibonacci);
//        printMinAndMaxFromArray(intArray);
//        countOfDigitsInNum(countOfDigits);
//        numberOfWordsInString(numberOfWords);
//        numberIsPalindromeOrNot(palindromeOrNot);
//        numberIsPrimeOrNot(primeNumOrNot);
//        removeSpecialCharacter(strWithSpecialChar);
//        reverseString(reversStr);
//        swappingOfNumber(2,5);
        trimUnlessFifty(trimString);
    }

    public static void showOccurrenceOfCharacters(String str) {

        String temp = str.replaceAll("\\s", "");


        char[] chars = temp.toCharArray();

        Map<Character, Integer> map = new HashMap<>();

        for (Character character : chars) {
            if (map.containsKey(character)) {
                map.put(character, map.get(character) + 1);
            } else {
                map.put(character, 1);
            }
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }


    public static void showOccurrenceOfCharacter(String str, String character) {

        int length = str.replaceAll(character, "").length();

        int strLength = str.length();

        int occurrence = strLength - length;

        System.out.println(occurrence);

    }

    public static void numberOfDigitsInNumber(int number) {

        int evenCount = 0;
        int oddCount = 0;

        while (number != 0) {

            int mod = number % 10;
            if (mod % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            number = number / 10;

        }

        System.out.println("Number of Even Digits : " + evenCount);
        System.out.println("Number of Odd Digits : " + oddCount);

    }

    public static void factorial(int num) {

        int fact = 1;

        if (num == 0 || num == 1) {
            System.out.println("Factorial Of Number is 1");
            return;
        }

        while (num != 1) {
            fact = fact * num;
            num = num - 1;
        }

        System.out.println(fact);

    }

    public static void printFibonacci(int n) {

        int first = 0;
        int second = 1;

        System.out.print(first + " " + second + " ");

        while (n != 0) {
            int sum = first + second;
            first = second;
            second = sum;
            System.out.print(sum + " ");
            n--;

        }
    }

    public static void printMinAndMaxFromArray(int[] array) {

        int max = array[0];

        int min = array[0];

        for (Integer integer : array) {
            if (max < integer) {
                max = integer;
            }

            if (min > integer) {
                min = integer;
            }
        }

        System.out.println("Maximum Value is : " + max);
        System.out.println("Minimum Value is : " + min);

    }

    public static void countOfDigitsInNum(int num) {
        int count = 0;

        while (num != 0) {

            count++;
            num = num/10;

        }

        System.out.println("Number Of Digits in Number is : "+count);
    }

    public static void numberOfWordsInString(String str){

        if (str.length()<1 || str == " "){
            System.out.println("No words found !!!");
            return;
        }

        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i+1)!= ' '){
                count++;
            }
        }

        System.out.println("Number of words are : "+count);

    }

    public static void numberIsPalindromeOrNot(int number){

        int rev = 0;

        while (number !=0 ){
            rev = rev * 10 + number % 10;
            number = number/10;

        }

        System.out.println(rev);

        if (rev == number){
            System.out.println("Yes it is palindrome");
        }else{
            System.out.println("It is not Palindrome");
        }
    }


    public static void numberIsPrimeOrNot(int num){

        int count = 0;

        for (int i = 1; i*i < num; i++) {

            if (num % i == 0){
                count++;
            }
        }

        if (count >= 2){
            System.out.println("It is Not Prime Number");
        }
        else{
            System.out.println("It is prime number");
        }

    }

    public static void removeSpecialCharacter(String str){

        String s = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);


    }

    public static void reverseString(String str){

        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--) {

            reverse = reverse + str.charAt(i);

        }

        System.out.println(reverse);

    }

    public static void swappingOfNumber(int a, int b){

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("num1 " +a +" num2 "+b );

    }

    public static void trimUnlessFifty(String str){

        int length = str.length();

        if (str.length()>=50){

            for (int i = length ; i > 1; i--){
                if (i <= 50){
                    if (String.valueOf(str.charAt(i)).equals(" ")
                            || !String.valueOf(str.charAt(i)).equals(" ")
                            && String.valueOf(str.charAt(i+1)).equals(" ")){

                        str = str.substring(0, i+1);
                        System.out.println(str);
                        break;

                    }else if(String.valueOf(str.charAt(i)).equals(" ")){
                        continue;
                    }

                }

            }
        }


    }

    public static int[] twoSum(int[] arr, int target){

        Arrays.sort(arr);

        int i = 0, j = arr.length-1;

        int[] answer = new int[2];

        //{3, 2, 4};


        while (i < j){

            if (arr[i] + arr[j] < target){
                i++;
            }else if (arr[i] + arr[j] > target){
                j--;
            }else {
                answer[0] = i;
                answer[1] = j;
                return answer;
            }
        }


        throw new IllegalArgumentException("No Solution Found");
    }
}
