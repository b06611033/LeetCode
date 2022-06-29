// will exceed time limit in very large cases
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return segment(s, 0, wordDict);
    }
    private boolean segment(String s, int pos, List<String> wordDict) {
        if (pos == s.length()) return true;
        for (int i = pos; i <= s.length(); i++) {
            if (wordDict.contains(s.substring(pos, i))) {
                if (segment(s, i, wordDict)) return true;
            } 
        }
        return false;
    }
    
}
