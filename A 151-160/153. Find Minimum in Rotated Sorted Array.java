//Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Minimum in Rotated Sorted Array.
//Memory Usage: 41.7 MB, less than 93.10% of Java online submissions for Find Minimum in Rotated Sorted Array.
class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];
        if (nums[0] < nums[nums.length - 1]) return nums[0];
        int pivot = nums[0];
        int smallest = Integer.MAX_VALUE;
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right)/2;
            int value = nums[mid];
            if (value >= pivot) left = mid + 1;
            else if (value < pivot && mid + 1 <nums.length && value < nums[mid+1] && mid - 1 >= 0 && value > nums[mid-1]) right = mid - 1;
            else return nums[mid];
        }
        return 0;
    }
}
