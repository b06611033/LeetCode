class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<List<Integer>>();// no identical elements in set
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        if (nums.length < 3) return answer;
        Arrays.sort(nums); // sort to avoid same integers but different permutation in list
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break; // sorted, so all int after i are larger than 0
            int target = -nums[i];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = i + 1; j < nums.length; j++) {
               int remaining = target - nums[j];
               if (map.containsKey(remaining)) {
                 List<Integer> current = new ArrayList<Integer>();
                 current.add(nums[i]);
                 current.add(nums[j]);
                 current.add(remaining);
                 set.add(current);
               } 
               else map.put(nums[j],j);
           }
        }
        answer = new ArrayList<List<Integer>>(set);
        return answer;
    }
}
