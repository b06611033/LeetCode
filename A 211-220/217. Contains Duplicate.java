//Runtime: 9 ms, faster than 82.89% of Java online submissions for Contains Duplicate.
//Memory Usage: 67.6 MB, less than 80.94% of Java online submissions for Contains Duplicate.
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return true;
            else set.add(nums[i]);
        }
        return false;
    }
}
