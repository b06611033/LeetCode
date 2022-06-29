class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] legit = new boolean[s.length() + 1];
        legit[0] = true; // initial case
        for (int i = 0; i < s.length(); i++) {
            for (String str: wordDict) {
                if (i + 1 >= str.length() && legit[i+1-str.length()] && str.equals(s.substring(i+1-str.length(), i+1))) {
                    legit[i+1] = true;
                    break;
                }
            }
        }
        return legit[s.length()];
    }
    
}
