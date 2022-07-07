//Runtime: 6 ms, faster than 62.50% of Java online submissions for Valid Anagram.
//Memory Usage: 45 MB, less than 37.86% of Java online submissions for Valid Anagram.
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);
        for (int i = 0; i < schar.length; i++) {
            if (schar[i] != tchar[i]) return false;
        }
        return true;
    }
}
