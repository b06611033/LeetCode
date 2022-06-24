//Runtime: 1 ms, faster than 98.17% of Java online submissions for Decode Ways.
//Memory Usage: 42.5 MB, less than 36.73% of Java online submissions for Decode Ways.
class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;
        if (s.length() == 1) return 1;
        int[] dp = new int [s.length()];
        dp[0] = 1;
        if ((s.charAt(0) - '0')*10 + s.charAt(1) - '0' <= 26 && s.charAt(1) != '0') dp[1] = 2;
        else if ((s.charAt(0) - '0')*10 + s.charAt(1) - '0' > 26 && s.charAt(1) == '0') dp[1] = 0;
        else dp[1] = 1;
        for (int i = 2; i < s.length(); i++) {
            int doubleVal = (s.charAt(i - 1) - '0')*10 + (s.charAt(i) - '0');
            if (doubleVal <= 26 && s.charAt(i-1) != '0' && s.charAt(i) != '0') {
                dp[i] = dp[i-1] + dp[i-2];
            }
            else if ((doubleVal > 26 || doubleVal == 0) && s.charAt(i) == '0') {
                dp[i] = 0;
            }
            else if (doubleVal <= 26 && s.charAt(i-1) != '0' && s.charAt(i) == '0') {
                dp[i] = dp[i-2];
            } 
            else dp[i] = dp[i-1];
        }
        return dp[s.length() - 1];
    }
}
