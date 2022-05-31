class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        if (nums.length < 4) return answer;
        Arrays.sort(nums);
        answer = new ArrayList<List<Integer>>(ksum(nums, target, 4, 0));
        return answer;
    }
    private Set<List<Integer>> ksum(int[] nums, int target, int k, int start) {
        Set<List<Integer>> set = new HashSet<List<Integer>>();// no identical elements in set
        if (k == 2) {
               int left = start;
               int right = nums.length - 1;
               while (left < right) {
                    int sum = nums[left] + nums[right];
                    if (target == sum) {
                        List<Integer> current = new ArrayList<Integer>();
                        current.add(nums[left]);
                        current.add(nums[right]);
                        set.add(current);
                    }
                    if (sum > target) right--;
                    else left++;
               }
        }      
        else {
                for (int i = start; i < nums.length-k+1; i++) {
                    Set<List<Integer>> temp = new HashSet<List<Integer>>();
                    temp = ksum(nums, target - nums[i], k-1, i+1);
                    if (!temp.isEmpty()){
                        for (List<Integer> l : temp) {
                            l.add(0, nums[i]);
                        }
                        set.addAll(temp);
                    }    
                }        
       }
            return set;
    }
}
