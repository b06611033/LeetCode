class Solution {
    public int longestValidParentheses(String s) {
       if (s.length() == 0) return 0;
       int longest = 0;
       int length = 0;
       int left = 0;
       int right = 0;
       for (int i = 0; i < s.length(); i++) {
           if (s.charAt(i) == '(') left++;
           else right++;
           if (right > left) {
               right = 0;
               left = 0;
           }
            if (right == left) {
               length = right + left;
               if (length > longest) longest = length;
           }
           
       }
       length = 0;
       left = 0;
       right = 0;
       for (int i = s.length() - 1; i >= 0; i--) {
           if (s.charAt(i) == '(') left++;
           else right++;
           if (right < left) {
               right = 0;
               left = 0;
           }
            if (right == left) {
               length = right + left;
               if (length > longest) longest = length;
           }
           
       }
        return longest;
    }
}
