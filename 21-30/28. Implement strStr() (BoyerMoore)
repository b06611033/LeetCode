class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int answer = -1;
        int[] table = new int[128];
        BoyerMoore(needle, table);
        int skip = 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i += skip) {
            for (int j = needle.length()-1; j >= 0; j--) {
                if (haystack.charAt(i+j) != needle.charAt(j)) {
                    System.out.println(needle.charAt(j));
                    skip = Math.max(1,j - table[haystack.charAt(i+j)]);
                    break;
                }
                if (j == 0) return i;
            }
        }
        return answer;
    }
    private void BoyerMoore(String s, int[] t) {
        for (int i = 0; i < t.length; i++) {
            t[i] = -1;
        }
        for (int i = 0; i < s.length(); i++) {
            t[s.charAt(i)] = i;
        }
    }
}
