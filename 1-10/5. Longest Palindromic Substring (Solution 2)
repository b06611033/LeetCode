//Dynamic Programming
class Solution {
    public String longestPalindrome(String s) {
        int length = s.length();
        String longest = new String();
        longest = s.substring(0,1);
        if (length == 1) return longest;
        boolean[][] symmetric = new boolean [length][length];
        for (int i = 0; i < length; i++) {
            symmetric[i][i] = true;  // the single character is always palindromic
        }
        for (int i = 1; i < length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (i - j == 1 || symmetric[i-1][j+1] == true) {
                        symmetric[i][j] = true;
                        if (i - j + 1 > longest.length()) longest = s.substring(j, i + 1);
                    }   
                }
            }
            
        }
        return longest;
    }
}
