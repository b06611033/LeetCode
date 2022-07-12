//Runtime: 4 ms, faster than 90.11% of Java online submissions for Palindromic Substrings.
//Memory Usage: 40.1 MB, less than 96.18% of Java online submissions for Palindromic Substrings.
class Solution {
    public int countSubstrings(String s) {
        int count = s.length();
        for (int i = 0; i < s.length(); i++) {
            // odd length palindromic
            int left = i - 1;
            int right = i + 1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            } 
            // even length palindromic
            left = i;
            right = i + 1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                count++;
                left--;
                right++;
            } 
        }
        return count;
    }
}
