//Runtime: 1 ms, faster than 96.85% of Java online submissions for Remove Duplicates from Sorted Array.
//Memory Usage: 48 MB, less than 26.89% of Java online submissions for Remove Duplicates from Sorted Array.
class Solution {
    public int removeDuplicates(int[] nums) {
        int pointer = 1; // position to put new value
        int value = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > value) {
                value = nums[i];
                nums[pointer] = value;
                pointer++;
            }
        }
        return pointer;
    }
}
