package dp;

public class DynamicProgrammingBasics {

    public static void main(String[] args) {

        int n = 18;
        int[] coins = {7, 5, 1};

        int ans = minCoins(n, coins);

        System.out.println(ans);
    }

    private static int minCoins(int n, int[] coins) {

        if (n==0){
            return 0;
        }

        int ans = Integer.MAX_VALUE;

        for (int i =0; i < coins.length; i++){

            if (n-coins[i] >= 0){
                int subAns = minCoins(n-coins[i], coins);

                if (subAns != Integer.MAX_VALUE && subAns+1 < ans){
                    ans = subAns+1;
                }
            }

        }

        return ans;
    }
}
