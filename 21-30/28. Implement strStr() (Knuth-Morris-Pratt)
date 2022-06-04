class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;
        int answer = -1;
        int[][] table = new int[128][needle.length()];
        int state = 0;
        dfa(needle, table);
        for (int i = 0; i < haystack.length(); i++) {
            state = table[haystack.charAt(i)][state];
            if (state == needle.length()) return i - needle.length() + 1;
        }
        return answer;
    }
    private void dfa(String s, int[][] t) {
        t[s.charAt(0)][0] = 1;
        for (int stateX = 0, i = 1; i < s.length(); i++) {
            for (int j = 0; j < 128; j++) t[j][i] = t[j][stateX];
            t[s.charAt(i)][i] = i + 1;
            stateX = t[s.charAt(i)][stateX]; 
        }
    }
    //stateX is used to update the current state i when mismatch happens
    //stateX starts from the second character, because when mismatch happens, we would shift one 
    //character, and compare the string again
    
}
