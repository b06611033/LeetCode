//Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber II.
//Memory Usage: 39.4 MB, less than 99.23% of Java online submissions for House Robber II.
class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        int largest = 0;
        boolean robbed = false;
        int[] dp = new int[nums.length];
        // first house robbed
        dp[0] = nums[0];
        dp[1] = nums[0];
        for (int i = 2; i < nums.length; i++) {
            if (i == nums.length - 1) {
                dp[i] = dp[i-1];
            }
            else if (robbed) {
                dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
                if (dp[i-2] + nums[i] > dp[i-1]) robbed = true;
            } 
            else {
                dp[i] = dp[i-1] + nums[i];
                robbed = true;
            } 
        }
        largest = dp[nums.length - 1];
        // first house not robbed
        dp[0] = 0;
        dp[1] = nums[1];
        robbed = true;
        for (int i = 2; i < nums.length; i++) {
            if (robbed) {
                dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
                if (dp[i-2] + nums[i] > dp[i-1]) robbed = true;
            } 
            else {
                dp[i] = dp[i-1] + nums[i];
                robbed = true;
            } 
        }
        if (dp[nums.length - 1] > largest) largest = dp[nums.length - 1];
        return largest;
    }
}
