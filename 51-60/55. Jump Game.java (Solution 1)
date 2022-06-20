class Solution {
    public boolean canJump(int[] nums) {
        int position = 0;
        while(position < nums.length - 1) {
            int furthest = 0;
            int nextPos = 0;
            for (int i = position + 1; i <= position + nums[position] && i < nums.length; i++) {
                if (i + nums[i] > furthest) {
                    furthest = i + nums[i];
                    nextPos = i;
                }
            }
            if (nums[nextPos] == 0 && nextPos != nums.length - 1) return false;
            position = nextPos;
        }
        return true;
    }
}
