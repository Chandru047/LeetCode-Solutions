class Solution {
    public int count(int coins[], int sum) {
        int[] dp = new int[sum + 1];
        int N = coins.length ;
        dp[0] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = coins[i]; j <= sum; j++) {
                dp[j] += dp[j - coins[i]];
            }
        }

        return dp[sum];
    }
}
