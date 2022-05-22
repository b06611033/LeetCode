//Runtime: 1 ms, faster than 82.31% of Java online submissions for Longest Common Prefix.
//Memory Usage: 39.9 MB, less than 96.90% of Java online submissions for Longest Common Prefix.
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int position = 0;
        StringBuilder prefix = new StringBuilder();
        while(true) {
            if (position > strs[0].length() - 1) break;
            char ch = strs[0].charAt(position);
            boolean withinBounds = true;
            boolean same = true;
            for (int i = 0; i < strs.length; i++) {
              if (position > strs[i].length() - 1) {
                  withinBounds = false;
                  break;
              } 
              if (ch != strs[i].charAt(position)) {
                  same = false;
                  break;
              }
            }
            if (!same || !withinBounds) break;
            prefix.append(ch);
            position++;
        }
        return prefix.toString();
    }
}
