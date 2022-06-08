//Runtime: 4 ms, faster than 84.82% of Java online submissions for Combination Sum II.
//Memory Usage: 42.4 MB, less than 91.81% of Java online submissions for Combination Sum II.
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> set = new HashSet<List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        Arrays.sort(candidates);
        combination(candidates, set, target, -1, list);
        List<List<Integer>> answer = new ArrayList<List<Integer>>(set);
        return answer;
    }
    private void combination(int[] c, Set<List<Integer>> a, int target, int position, List<Integer> list) {
        int previous = 0;
        for (int i = position + 1; i < c.length; i++) {
            // skip repeat
            if (previous == c[i]) {
                if (i == c.length - 1 && !list.isEmpty()) list.remove(list.size() - 1);
                continue;
            } 
            // if encounter last element in array, there are no more possible combintations with the 
            // current list, so remove the last element in the list
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
            previous = c[i];
            if (i == c.length - 1 && !list.isEmpty()) list.remove(list.size() - 1);
        }
        if (position == c.length - 1 && !list.isEmpty()) list.remove(list.size() - 1);
        return;
    }
}
