package recursion.interview;

public class GcdNumber {
    public static void main(String[] args) {
        System.out.println(gcd(4,8));
    }
    static int gcd(int a, int b){
        if (a<0 || b<0){
            return -1;
        }
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);

    }
}
