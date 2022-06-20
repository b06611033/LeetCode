//Runtime: 2 ms, faster than 90.47% of Java online submissions for Jump Game.
//Memory Usage: 42.8 MB, less than 89.55% of Java online submissions for Jump Game.
class Solution {
    public boolean canJump(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) return true;
            if (nums[i] == 0) {
                int j = i - 1;
                boolean canEscape = false;
                while(j >= 0) {
                    if (j + nums[j] > i) {
                        canEscape = true;
                        break;
                    }
                    j--;
                }
                if (!canEscape) return false;
            }
        }
        return true;
    }
}
