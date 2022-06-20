// dp[i][j]: true if the first i char in String s matches the first j chars in String p
class Solution {
    public boolean isMatch(String s, String p) {
       int slen = s.length();
       int plen = p.length();
       boolean[][] dp = new boolean[slen + 1][plen + 1];
       dp[0][0] = true; // the 0th char (which is null) in s and p  must match
       for (int j = 1;j < plen + 1; j++) {  // base case
           if (p.charAt(j - 1) == '*' && dp[0][j-1]) dp[0][j] = true; 
       } 
       for (int i = 1; i < slen + 1; i++) {
           for (int j = 1; j < plen + 1; j++) {
               if (p.charAt(j-1) == '*' && (dp[i-1][j] || dp[i][j-1] || dp[i-1][j-1]))
                   dp[i][j] = true;
               else if (dp[i-1][j-1] && (p.charAt(j-1) == s.charAt(i-1) || p.charAt(j-1) == '?')) 
                   dp[i][j] = true;              
           }
       }
        return dp[slen][plen];
    }
}
