class Solution {
    public int maxProduct(int[] nums) {
        int largest = nums[0], max = nums[0], min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(max*nums[i], nums[i]);
            min = Math.min(min*nums[i], nums[i]);
            largest = Math.max(largest, max);
        }
        return largest;
    }
}
