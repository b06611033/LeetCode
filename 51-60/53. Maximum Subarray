//Runtime: 2 ms, faster than 65.77% of Java online submissions for Maximum Subarray.
//Memory Usage: 73.3 MB, less than 64.68% of Java online submissions for Maximum Subarray.
class Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];
        int answer = 0;
        int largestNonPositive = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largestNonPositive) largestNonPositive = nums[i];
            int temp = 0;
            if (nums[i] > 0) {
                int j = i;
                while(temp >= 0 && j < nums.length) {
                    temp += nums[j];
                    if (temp > answer) answer = temp;
                    j++;
                }
                i = j - 1;
            }
        }
        if (answer == 0) return largestNonPositive; // if no positive in nums array
        return answer;
    }
}
