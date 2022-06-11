//Runtime: 10 ms, faster than 78.38% of Java online submissions for Group Anagrams.
//Memory Usage: 55.9 MB, less than 48.40% of Java online submissions for Group Anagrams.
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        for (int i = 0; i < strs.length; i++) {
           char[] temp = strs[i].toCharArray();
           Arrays.sort(temp);
           String s = String.valueOf(temp);
           if (map.containsKey(s)) map.get(s).add(strs[i]);
           else {
               map.put(s, new ArrayList<>());
               map.get(s).add(strs[i]);
           } 
        }
        List<List<String>> answer = new ArrayList<>(map.values());
        return answer;
    }
}
