//Runtime: 1 ms, faster than 98.17% of Java online submissions for Decode Ways.
//Memory Usage: 40.8 MB, less than 86.21% of Java online submissions for Decode Ways.
class Solution {
    public int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;
        if (s.length() == 1) return 1;
        int dp1 = 1, dp2 = 0;
        if ((s.charAt(0) - '0')*10 + s.charAt(1) - '0' <= 26 && s.charAt(1) != '0') dp2 = 2;
        else if ((s.charAt(0) - '0')*10 + s.charAt(1) - '0' > 26 && s.charAt(1) == '0') dp2 = 0;
        else dp2 = 1;
        int current = dp2;
        for (int i = 2; i < s.length(); i++) {
            int doubleVal = (s.charAt(i - 1) - '0')*10 + (s.charAt(i) - '0');
            if (doubleVal <= 26 && s.charAt(i-1) != '0' && s.charAt(i) != '0') {
                current = dp1 + dp2;
            }
            else if ((doubleVal > 26 || doubleVal == 0) && s.charAt(i) == '0') {
                current = 0;
            }
            else if (doubleVal <= 26 && s.charAt(i-1) != '0' && s.charAt(i) == '0') {
                current = dp1;
            } 
            else current = dp2;
            dp1 = dp2;
            dp2 = current;
        }
        return current;
    }
}
