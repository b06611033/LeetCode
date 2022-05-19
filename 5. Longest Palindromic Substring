//brute force
class Solution {
    public String longestPalindrome(String s) {
        boolean found = false;;
        String longestString = new String();
        for (int i = s.length(); i >= 0; i--) {
            for (int j = 0; j + i <= s.length();j++) {
                int length = 0;
                int end = j + i - 1;
                StringBuilder temp = new StringBuilder();
                for (int k = 0; k < i; k++) {
                    if (s.charAt(j + k)!=s.charAt(end - k)) break;
                    temp.append(s.charAt(j+k));
                    length++;
                }
                if (length == i) {
                    longestString = temp.toString();
                    found = true;
                    break;
                } 
            }
            if (found) break;
        }
        return longestString;
    }
}
