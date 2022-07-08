//Runtime: 24 ms, faster than 67.69% of Java online submissions for Coin Change.
//Memory Usage: 45 MB, less than 64.15% of Java online submissions for Coin Change.
class Solution {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) return 0;
        int[] dp = new int[amount+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i < amount+1; i++) {
          for (int num: coins) {
            if (i - num >= 0 && dp[i-num] != Integer.MAX_VALUE) dp[i] = Math.min(dp[i], dp[i-num] + 1);
          }
        }
        if (dp[amount] == Integer.MAX_VALUE) return -1;
        return dp[amount];
    }
  
}
