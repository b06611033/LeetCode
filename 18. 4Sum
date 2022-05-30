class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> set = new HashSet<List<Integer>>();// no identical elements in set
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        if (nums.length < 4) return answer;
        Arrays.sort(nums); // sort to avoid same integers but different permutation in list
        for (int i = 0; i < nums.length - 3; i++) {
            System.out.println(nums[i]*4);
            if (nums[i]*4 > target && nums[i]*4 < 2147483647 && nums[i]*4 < -2147483648) break;
            System.out.println(nums[i]);
            int threeSum = target - nums[i];
            for (int j = i + 1; j < nums.length - 2; j++) {
               if (nums[j]*3 > threeSum && nums[j]*3 < 2147483647 && nums[j]*3 < -2147483648) break;
               int twoSum = threeSum - nums[j];
               int left = j + 1;
               int right = nums.length - 1;
               while (left < right) {
                    int sum = nums[left] + nums[right];
                    if (twoSum == sum) {
                        List<Integer> current = new ArrayList<Integer>();
                        current.add(nums[i]);
                        current.add(nums[j]);
                        current.add(nums[left]);
                        current.add(nums[right]);
                        set.add(current);
                    }
                    if (sum > twoSum) right--;
                    else left++;
               }
           }
        }
         
        answer = new ArrayList<List<Integer>>(set);
        return answer;
    }
}
