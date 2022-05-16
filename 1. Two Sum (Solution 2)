//Runtime: 4 ms, faster than 68.49% of Java online submissions for Two Sum.
//Memory Usage: 45.4 MB, less than 40.05% of Java online submissions for Two Sum.
import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (map.containsKey(remaining)) {
                ans[0] = i;
                ans[1] = map.get(remaining);
                break;
            } 
            else map.put(nums[i],i);
        }
        return ans;
    }
}
