package rough;

import java.util.HashMap;
import java.util.Map;

public class Practice2 {

    public static void main(String[] args) {

        String[] stringArray = {"java", "C", "C++", "python", "C#", "java"};

        int num = 324576849;

        int number = 12345421;

        String str = "I love India and India is great country I love aindia from deep of my heart";

        trimUnless50(str);
//        numberIsPrime(num);
//        numberIsPalindrome(number);
//        fibonacciNumber(10);
//        evenAndOddInNumber(num);
//        duplicate(stringArray);

    }

    private static void trimUnless50(String str) {

        String ans = "";

        if (str.length() > 50){

            for (int i = str.length(); i>=1; i--){

                if ( i <= 50){

                    if (String.valueOf(str.charAt(i)).equals(" ")||!String.valueOf(str.charAt(i)).equals(" ")
                                    && String.valueOf(str.charAt(i+1)).equals(" ")){
                        ans = str.substring(0, i);
                        break;
                    }


                }else {
                    continue;
                }

            }


        }else{
            System.out.println("String should be greater or equal to length 50");
        }

        System.out.println(ans);
    }

    private static void numberIsPrime(int num) {


        int count = 0;

        int temp = num;

        for (int i =1; i<=num; i++){
            if (num % i == 0){
                count++;
            }

        }

        if (count >=2){
            System.out.println("Not Prime Number");
        }else{
            System.out.println(" Prime Number");
        }
    }

    private static void numberIsPalindrome(int number) {

        int temp = number;

        int rev = 0;

        while (temp != 0 ){

             rev = rev * 10 +temp % 10;

             temp/=10;

        }
        if (rev == number){

            System.out.println("Palindrom");

        }else{
            System.out.println("Not Palindrome");
        }

    }


    private static void fibonacciNumber(int i) {

        int a = 0;
        int b = 1;

        System.out.print("0 1 ");

        while (i !=0){

            int sum  = a + b;
            a = b;
            b = sum;
            System.out.print(sum+" ");
            i--;

        }
    }

    private static void evenAndOddInNumber(int num) {

        int odd = 0;
        int even = 0;


        while (num != 0){

            int temp = num % 10;
            if (temp % 2 == 0){
                even++;
            }else{
                odd++;
            }

            num/=10;
        }

        System.out.println("Even Digits "+ even+" Odd Digits "+odd);

    }

    private static void duplicate(String[] stringArray) {

        HashMap<String, String> hashMap = new HashMap<>();

        for (String str : stringArray){

            if (!hashMap.containsKey(str)){

                hashMap.put(str, "1");
            }else {
                hashMap.put(str, "Duplicate");
            }

        }

        for (Map.Entry e : hashMap.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}

