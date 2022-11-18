package basic_java_questions;

public class TrimWordUnlessFifty {

    public static void main(String[] args) {
        String str = "I love India and India is great country I loveaindia from deep of my heart";
        trimWordUnlessFifty(str);

    }

    public static void trimWordUnlessFifty(String str){

        int length = str.length();

        if (length > 50){
            for (int i = length; i>=1; i--){
                if (i <= 50){
                    if (String.valueOf(str.charAt(i)).equals(" ")
                            || !String.valueOf(str.charAt(i)).equals(" ")
                    && String.valueOf(str.charAt(i+1)).equals(" ")){
                        str = str.substring(0,i+1);
                        System.out.println(str);
                        break;
                    } else if (String.valueOf(str.charAt(i)).equals(" ")) {
                        continue;
                    }
                }
            }
        }else{
            System.out.println(str);
        }

    }
}
