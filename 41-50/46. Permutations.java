//Runtime: 1 ms, faster than 96.70% of Java online submissions for Permutations.
//Memory Usage: 42.2 MB, less than 98.73% of Java online submissions for Permutations.
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        List<Integer> numList = new ArrayList<Integer>();       
        for (int i = 0; i < nums.length; i++) {
            numList.add(nums[i]);
        }
        List <Integer> list = new ArrayList <Integer>();
        permutate(numList, answer, list);
        return answer;
    }
    private void permutate (List<Integer> numList, List<List<Integer>> answer, List<Integer> list) {
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
