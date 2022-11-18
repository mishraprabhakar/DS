package core_java.passbyvalue;

public class PassByValue {

    //Java is pass by value

    public static void main(String[] args) {

        int num = 11;
        int i = changeValue(num);
        System.out.println(num);


    }

    //In this method we are modifying the value of num we can see it persist with its previous value
    //which shows Java is pass by value.
    public static int changeValue(int a){
        a = 12;
        return a;
    }
}
