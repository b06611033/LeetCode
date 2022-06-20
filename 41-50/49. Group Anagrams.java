// will exceed time limit in large cases
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<List<String>>();
        for (int i = 0; i < strs.length; i++) {
            boolean inList = false;
            for (int j = 0; j < answer.size(); j++) {
                List<String> temp = new ArrayList<String>(answer.get(j));
                if (isAnagram(temp.get(0), strs[i])) {
                    temp.add(strs[i]);
                    answer.set(j, temp);
                    inList = true;
                    break;
                } 
            }
            if (!inList) {
                List<String> newList = new ArrayList<String>();
                newList.add(strs[i]);
                answer.add(newList);
            }
        }
        return answer;
    }
    private boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        Map<Character, Integer> map1 = new HashMap<Character, Integer>();
        Map<Character, Integer> map2 = new HashMap<Character, Integer>();
        for (int i = 0; i < s1.length(); i++) {
            if (map1.containsKey(s1.charAt(i))) {
                map1.replace(s1.charAt(i), map1.get(s1.charAt(i) + 1));
            }
            else map1.put(s1.charAt(i), 1);
        }
        for (int i = 0; i < s2.length(); i++) {
            if (map2.containsKey(s2.charAt(i))) {
                map2.replace(s2.charAt(i), map2.get(s2.charAt(i) + 1));
            }
            else map2.put(s2.charAt(i), 1);
        }
        return map1.equals(map2);                  
    }
}
