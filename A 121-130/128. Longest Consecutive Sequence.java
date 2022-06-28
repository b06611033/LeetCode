class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        int answer = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int count = 1;
        for (Integer num: set) {
            if (!set.contains(num-1)) {
                while(set.contains(num+1)) {
                    count++;
                    if (answer < count) answer = count;
                    num++;
                }
            }
            count = 1;
        }
        if (count > answer) answer = count;
        return answer;
    }
}
