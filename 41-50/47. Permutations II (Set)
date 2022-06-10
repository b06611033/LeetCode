//Runtime: 48 ms, faster than 20.62% of Java online submissions for Permutations II.
//Memory Usage: 42.7 MB, less than 98.56% of Java online submissions for Permutations II.
 class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        List<Integer> numList = new ArrayList<Integer>();       
        for (int i = 0; i < nums.length; i++) {
            numList.add(nums[i]);
        }
        List <Integer> list = new ArrayList <Integer>();
        permutate(numList, set, list);
        List<List<Integer>> answer = new ArrayList<List<Integer>>(set);
        return answer;
    }
    private void permutate (List<Integer> numList, Set<List<Integer>> answer, List<Integer> list) {
        if (numList.size() == 1) {
            list.add(numList.get(0));
            answer.add(list);
            return;
        } 
        for (int i = 0; i < numList.size(); i++) {
             List <Integer> newList = new ArrayList <Integer>(list);
             newList.add(numList.get(i));
             List <Integer> newNumList = new ArrayList <Integer>(numList);
             newNumList.remove(i);
             permutate(newNumList, answer, newList);
        }
        return;
    }
        
}
