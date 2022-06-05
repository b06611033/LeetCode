class Solution {
    public int longestValidParentheses(String s) {
        if (s.length() == 0) return 0;
        int longest = 0;
        for (int i = 0; i < s.length() - longest; i++) {
            boolean possible = true;
            if (s.charAt(i) == ')') continue;
            for (int j = longest + 2; i+j <= s.length(); j += 2) {
                 String sub = s.substring(i, i+j);
                 if (valid(sub, possible)) longest = j;
                 if (!possible) break;
            }    
        }
        return longest;
        
    }
    private boolean valid(String s, boolean p) {
        int left = 0;
        int right = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') left++;
            else right++;
            if (left > s.length()/2) return false;
            if (right > left) {
                p = false;
                return false;
            } 
        }
        return (left == right);
    }
}
