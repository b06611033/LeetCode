class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        String s = String.valueOf(x);
        int mid = s.length()/2;
        int right = mid;
        int left = mid;
        if (s.length()%2 == 0) {
            right = mid;
            left = mid - 1;
            while (right < s.length()) {
                if (s.charAt(right) != s.charAt(left)) return false;
                right++;
                left--;
            }
            return true;
        }
        else {
            right = mid + 1;
            left = mid - 1;
            while (right < s.length()) {
                if (s.charAt(right) != s.charAt(left)) return false;
                right++;
                left--;
            }
            return true;
        }
    }
}
