//Runtime: 0 ms, faster than 100.00% of Java online submissions for Remove Element.
//Memory Usage: 42.4 MB, less than 59.38% of Java online submissions for Remove Element.
class Solution {
    public int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;
        int pointer = nums.length - 1; // position to put removed value
        boolean noVal = true; // check if there is any val in nums
        for (int i = 0; i <= pointer; i++) {
            if (nums[i] == val) {
                while(nums[pointer] == val && pointer > i) pointer--;
                nums[i] = nums[pointer];
                nums[pointer] = val;
                noVal = false;
            }
        }
        if (noVal) return nums.length;
        return pointer;
    }
}
