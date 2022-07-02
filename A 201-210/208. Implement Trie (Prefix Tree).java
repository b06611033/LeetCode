//Runtime: 52 ms, faster than 74.01% of Java online submissions for Implement Trie (Prefix Tree).
//Memory Usage: 66.9 MB, less than 68.22% of Java online submissions for Implement Trie (Prefix Tree).
class Trie {
    
    private TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }
    
    public void insert(String word) {
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
        for (int i = 0; i < word.length(); i++) {
            if (node.contains(word.charAt(i))) node = node.get(word.charAt(i));
            else return false;
        }
        return node.isEnd();
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            if (node.contains(prefix.charAt(i))) node = node.get(prefix.charAt(i));
            else return false;
        }
        return true;
    }
}

class TrieNode {
    private boolean isEnd;
    private TrieNode[] child;
    private final int R = 26;
    public TrieNode() {
        child = new TrieNode[R];
    }
    public boolean contains(char c) {
        return child[c - 'a'] != null;
    }
    public void put(char c, TrieNode n) {
        child[c - 'a'] = n;
    }
    public TrieNode get(char c) {
        return child[c - 'a'];
    }
    public boolean isEnd() {
        return isEnd;
    }
    public void setEnd() {
        isEnd = true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
