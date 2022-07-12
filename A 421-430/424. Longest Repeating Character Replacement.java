//Runtime: 77 ms, faster than 16.84% of Java online submissions for Longest Repeating Character Replacement.
//Memory Usage: 42.3 MB, less than 86.90% of Java online submissions for Longest Repeating Character Replacement.
class Solution {
    public int characterReplacement(String s, int k) {
        int longest = 0;
        for (int i = 0; i < 26; i++) {
            int replaced = 0;
            char c = (char)('A' + i);
            int left = 0;
            int right = 0;
            while (right < s.length()) {
                if (s.charAt(right) == c) {
                    right++;
                }
                else if (s.charAt(right) != c && replaced < k) {
                    right++;
                    replaced++;
                }
                else if (s.charAt(right) != c && replaced == k) {
                    longest = Math.max(longest, right - left);
                    while (s.charAt(left) == c) left++; 
                    left++;
                    replaced--;
                } 
            }
            longest = Math.max(longest, right - left);
        }
        return longest;
    }
}
