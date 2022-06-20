//Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
//Memory Usage: 43.4 MB, less than 52.45% of Java online submissions for Search Insert Position.
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid;
        while (left <= right) {
            mid = (left+right)/2;
            if (nums[mid] > target) {
                right = mid -1;
            }
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            else return mid;
        }
        return right+1;
    }
}
