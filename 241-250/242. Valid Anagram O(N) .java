//Runtime: 6 ms, faster than 62.50% of Java online submissions for Valid Anagram.
//Memory Usage: 43.9 MB, less than 54.73% of Java online submissions for Valid Anagram.
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] schar = new int[26];
        int[] tchar = new int[26];
        for (int i = 0; i < s.length(); i++) {
            schar[s.charAt(i) - 'a']++;
            tchar[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (schar[i] != tchar[i]) return false;
        }
        return true;
    }
}
