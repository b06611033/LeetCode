//Runtime: 2 ms, faster than 95.20% of Java online submissions for Regular Expression Matching.
//Memory Usage: 41.3 MB, less than 85.96% of Java online submissions for Regular Expression Matching.
class Solution {
    public boolean isMatch(String s, String p) {
        int slen = s.length();
        int plen = p.length();
        boolean[][] dp = new boolean[slen + 1][plen + 1];
        dp[0][0] = true;
        for (int i = 2; i < plen+1; i+=2) {
            if (p.charAt(i - 1) == '*' && dp[0][i-2]) {
                dp[0][i] = true;
                dp[0][i-1] = true;
            } 
        }
        for (int i = 1; i < slen + 1; i++) {
            for (int j = 1; j < plen + 1; j++) {
                // if encounter '*'
               if (p.charAt(j-1) == '*') {
                   // universal conditions
                   if (dp[i][j-1]) dp[i][j] = true;
                   else if (j >= 2 && dp[i][j-2])  dp[i][j] = true;
                   // if '.' before '*'
                   else if (j >= 2 && p.charAt(j-2) == '.') {
                         if (dp[i-1][j-1] || dp[i-1][j-2]) {
                             for (int k = i; k < slen + 1; k++) dp[k][j] = true;
                         } 
                         if (i >= 2 && dp[i-1][j] && s.charAt(i-1) == s.charAt(i-2)) dp[i][j] = true;
                   }
                   // if normal char before '*'
                   else {
                       if (i >= 2 && dp[i-1][j-1] && s.charAt(i-1) == s.charAt(i-2)) dp[i][j] = true;
                       if (i >= 2 && j >= 2 && dp[i-1][j] && s.charAt(i-1) == s.charAt(i-2) && p.charAt(j-2) == s.charAt(i-1)) dp[i][j] = true;
                   }
               }
                // if encounter '.'
                else if (p.charAt(j-1) == '.') {
                    if (dp[i-1][j-1]) dp[i][j] = true;
                }
                // if encounter normal char
                else {
                    if (p.charAt(j-1) == s.charAt(i-1) && dp[i-1][j-1]) dp[i][j] = true;
                }
            }
        }
        return dp[slen][plen];
    }
}
