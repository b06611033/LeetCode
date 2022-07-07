//Runtime: 64 ms, faster than 63.92% of Java online submissions for Longest Increasing Subsequence.
//Memory Usage: 41.9 MB, less than 88.52% of Java online submissions for Longest Increasing Subsequence.
class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1) return 1;
        int answer = 1;
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            answer = Math.max(answer, dp[i]);
        }
        return answer;
    }
}
