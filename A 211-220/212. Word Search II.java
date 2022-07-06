class Solution {
    List<String> answer;
    Trie dictionary;
    int m;
    int n;
    int longest;
    public List<String> findWords(char[][] board, String[] words) {
        m = board.length;
        n = board[0].length;
        longest = 0;
        answer = new ArrayList<String>();
        dictionary = new Trie();
        for (String s: words) {
            dictionary.insert(s);
            if (s.length() > longest) longest = s.length();
        }
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                find(board, i, j, visited, "", 0);
            }
        }
        return answer; 
    }
    private void find(char[][] board, int row, int col, boolean[][] visited, String s, int len) {
        if (row < 0 || col < 0 || row >= m || col >= n) return;
        if (visited[row][col]) return;
        String newString = new String(s);
        newString += board[row][col];
        len++;
        if (len > longest) return;
        if (!dictionary.startsWith(newString)) return;
        if (dictionary.search(newString)) {
                answer.add(newString);
                dictionary.remove(newString);
        } 
        visited[row][col] = true;
        find(board, row+1, col, visited, newString, len);
        find(board, row, col+1, visited, newString, len);
        find(board, row-1, col, visited, newString, len);
        find(board, row, col-1, visited, newString, len);
        visited[row][col] = false;
        return;
    }
}
class Trie {
    private TrieNode root;
    public Trie() {
        root = new TrieNode();
    }
    public void insert(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (!node.contain(word.charAt(i))) {
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
            if (node.contain(word.charAt(i))) node = node.get(word.charAt(i));
            else return false;
        }
        return node.isEnd();
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (int i = 0; i < prefix.length(); i++) {
            if (node.contain(prefix.charAt(i))) node = node.get(prefix.charAt(i));
            else return false;
        }
        return true;
    }
    
    public void remove(String word) {
        TrieNode node = root;
        for (int i = 0; i < word.length(); i++) {
            if (node.contain(word.charAt(i))) node = node.get(word.charAt(i));
            else return;
        }
        node.removeEnd();
    }
}

class TrieNode {
    private final int R = 26;
    private boolean isEnd;
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
    public boolean contain(char c) {
        return child[c - 'a'] != null;
    }
    public boolean isEnd() {
        return isEnd;
    }
    public void setEnd() {
        isEnd = true;
    }
    public void removeEnd() {
        isEnd = false;
    }
}
