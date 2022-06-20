//Runtime: 2 ms, faster than 99.63% of Java online submissions for Combination Sum.
//Memory Usage: 42.4 MB, less than 93.30% of Java online submissions for Combination Sum.
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(candidates);
        combination(candidates, answer, target, 0, list);
        return answer;
    }
    private void combination(int[] c, List<List<Integer>> a, int target, int position, List<Integer> list)     {
        for (int i = position; i < c.length; i++) {
            if (c[i] > target) {
                if (!list.isEmpty()) list.remove(list.size() - 1);
                return;
            } 
            list.add(c[i]);
            if (c[i] == target) {
                 List<Integer> temp = new ArrayList<Integer>();
                 temp.addAll(list);
                 a.add(temp);
                 list.remove(Integer.valueOf(c[i]));
                 if (!list.isEmpty()) list.remove(list.size() - 1);
                 return;
            }
            int newTarget = target - c[i];
            combination(c, a, newTarget, i, list);
            if (i == c.length - 1 && !list.isEmpty()) list.remove(list.size() - 1);
        }
        return;
    }
}
