class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 1) return 1;
        int[] dp = new int[nums.length]; // save the smallest last number of length i+1 sequence
        int size = 0; 
        for (int i = 0; i < nums.length; i++) {
            int left = 0;
            int right = size-1;
            while(left <= right) {
                int mid = (left+right)/2;
                if (dp[mid] >= nums[i]) right = mid - 1;
                else if (dp[mid] < nums[i]) left = mid+1;
            }
            dp[left] = nums[i];
            if (left == size) size++;
        }
        return size;
    }
}
