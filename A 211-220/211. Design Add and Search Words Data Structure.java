//Runtime: 560 ms, faster than 90.85% of Java online submissions for Design Add and Search Words Data Structure.
//Memory Usage: 104.5 MB, less than 82.31% of Java online submissions for Design Add and Search Words Data Structure.
class WordDictionary {
    private TrieNode root;
    public WordDictionary() {
        root = new TrieNode();
    }
    
    public void addWord(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.contains(word.charAt(i))) {
                TrieNode newNode = new TrieNode();
                node.put(word.charAt(i), newNode);
                node = newNode;
            }
            else node = node.get(word.charAt(i));
        }
        node.setEnd();
    }
    
    public boolean search(String word) {
        TrieNode node = root;
        return wildCardSearch(node, word, 0);
    }
    
    public boolean wildCardSearch(TrieNode node, String s, int pos) {
        for (int i = pos; i < s.length(); i++) {
            if (s.charAt(i) == '.') {
                for (int j = 0; j < 26; j++) {
                    if (node.contains((char)(97 + j))) {
                        if (wildCardSearch(node.get((char)(97 + j)), s, i+1)) return true;
                    } 
                }
                return false;
            }
            else {
                if (node.contains(s.charAt(i))) {
                    node = node.get(s.charAt(i));
                }
                else return false;
            }
        }
        return node.isEnd();
    }
}

class TrieNode {
    private boolean isEnd;
    private final int R = 26;
    private TrieNode[] child;
    public TrieNode() {
        child = new TrieNode[R];
    }
    public void put(char c, TrieNode n) {
        child[c - 'a'] = n;
    }
    public TrieNode get(char c) {
        return child[c - 'a'];
    }
    public boolean contains(char c) {
        return child[c - 'a'] != null;
    }
    public boolean isEnd() {
        return isEnd;
    }
    public void setEnd() {
        isEnd = true;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */
