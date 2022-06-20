//Runtime: 0 ms, faster than 100.00% of Java online submissions for Search in Rotated Sorted Array.
//Memory Usage: 41.8 MB, less than 86.19% of Java online submissions for Search in Rotated Sorted Array.
class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int pivot = nums[0];
        int position = 0;
        if (target == pivot) return 0; 
        while(start <= end) {
            position = (start + end)/2;
            int val = nums[position];
            if (target > pivot && target < val) {
                end = position - 1;
            }
            else if (target < pivot && target > val) {
                start = position + 1;
            }
            else if (target > pivot && target > val) {
               if (pivot > val) {
                   end = position - 1;
               }
               else if (pivot <= val) {
                   start = position + 1;
               }
            }
            else if (target < pivot && target < val) {
               if (pivot > val) {
                   end = position - 1;
               }
               if (pivot <= val) {
                   start = position + 1;
               }
            }
            else return position;
        }
        return -1;
    }
}
