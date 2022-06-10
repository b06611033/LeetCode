//Runtime: 2 ms, faster than 73.85% of Java online submissions for Jump Game II.
//Memory Usage: 48.6 MB, less than 71.48% of Java online submissions for Jump Game II.
class Solution {
    public int jump(int[] nums) {
        int len = nums.length;
        int count = 0;
        boolean reached = false;
        for (int i = 0; i < len; i++) {
            if (i == len - 1) break;
            int jump = nums[i];
            int furthest = 0;
            int position = 0;
            for (int j = i + 1; j <= i+jump; j++) {
                if (j >= len - 1) {
                    count++;
                    reached = true;
                    break;
                }
                int potential = j + nums[j];
                if (potential > furthest) {
                    furthest = potential;
                    position = j;
                } 
            }
            if (reached) break;
            i = position - 1;
            count++;
        }
        return count;
    }
}
