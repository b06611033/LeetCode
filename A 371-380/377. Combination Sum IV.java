//Runtime: 2 ms, faster than 64.80% of Java online submissions for Combination Sum IV.
//Memory Usage: 41.1 MB, less than 74.77% of Java online submissions for Combination Sum IV.
class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int n: nums) {
                if (i - n >= 0) dp[i] += dp[i-n];
            }
        }
        return dp[target];
    }
}
