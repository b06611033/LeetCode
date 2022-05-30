//Runtime: 6 ms, faster than 95.90% of Java online submissions for 3Sum Closest.
//Memory Usage: 41.9 MB, less than 81.40% of Java online submissions for 3Sum Closest.
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length == 3) return nums[0] + nums[1] + nums[2];
        int answer = 0;
        int closest = Integer.MAX_VALUE;
        Arrays.sort(nums); // sort to avoid same integers but different permutation in list
        for (int i = 0; i < nums.length; i++) {
            int start = i + 1;
            int end = nums.length - 1;
            while (start < end) {
               int sum = nums[i] + nums[start] + nums[end];
               if (sum == target) return target;
               if (Math.abs(sum - target) <= closest) {
                   closest = Math.abs(sum - target);
                   answer = sum;
               }
               if (sum > target) end--;
               else start++;
           }
        }
        return answer;
    }
}
