//Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber.
//Memory Usage: 39.3 MB, less than 99.01% of Java online submissions for House Robber.
class Solution {
    public int rob(int[] nums) {
        int dp1 = 0, dp2 = 0, dp3 = 0;
        boolean robbed = false;
        dp1 = nums[0];
        dp3 = nums[0];
        if (nums.length > 1 && nums[1] > nums[0]) {
            dp2 = nums[1];
            dp3 = nums[1];
            robbed = true;
        }
        else if (nums.length > 1) {
            dp2 = nums[0];
            dp3 = nums[0];
        } 
        for (int i = 2; i < nums.length; i++) {
            if (robbed) {
                 if (dp1 + nums[i] > dp2) {
                     dp3 = dp1 + nums[i];
                     robbed = true;
                 }
                else {
                    dp3 = dp2;
                    robbed = false;
                }  
            }
            else {
                dp3 = dp2 + nums[i];
                robbed = true;
            } 
            dp1 = dp2;
            dp2 = dp3;
        }
        return dp3;
    }
}
