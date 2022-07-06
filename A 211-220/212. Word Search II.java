// exceed time limit in large cases
class Solution {
    List<String> answer;
    Set<String> dictionary;
    int m;
    int n;
    int longest;
    public List<String> findWords(char[][] board, String[] words) {
        m = board.length;
        n = board[0].length;
        longest = 0;
        answer = new ArrayList<String>();
        dictionary = new HashSet<String>();
        for (String s: words) {
            dictionary.add(s);
            if (s.length() > longest) longest = s.length();
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                boolean[][] traversed = new boolean[m][n];
                traversed[i][j] = true;
                String s = new String();
                s += board[i][j];
                if (dictionary.contains(s)) {
                    answer.add(s);
                    dictionary.remove(s);
                } 
                find(board, i, j, traversed, s, 2);
            }
        }
        return answer; 
    }
    private void find(char[][] board, int row, int col, boolean[][] traversed, String s, int len) {
        if (len > longest) return;
        if (row < m-1 && !traversed[row+1][col]) {
            boolean[][] newTraversed = new boolean[m][n];
            deepCopy(traversed, newTraversed);
            newTraversed[row+1][col] = true;
            String newString = new String(s);
            newString += board[row+1][col];
            if (dictionary.contains(newString)) {
                answer.add(newString);
                dictionary.remove(newString);
            } 
            find(board, row+1, col, newTraversed, newString, len+1);
        }
        if (col < n-1 && !traversed[row][col+1]) {
            boolean[][] newTraversed = new boolean[m][n];
            deepCopy(traversed, newTraversed);
            newTraversed[row][col+1] = true;
            String newString = new String(s);
            newString += board[row][col+1];
            if (dictionary.contains(newString)) {
                answer.add(newString);
                dictionary.remove(newString);
            } 
            find(board, row, col+1, newTraversed, newString, len+1);
        }
        if (row > 0 && !traversed[row-1][col]) {
            boolean[][] newTraversed = new boolean[m][n];
            deepCopy(traversed, newTraversed);
            newTraversed[row-1][col] = true;
            String newString = new String(s);
            newString += board[row-1][col];
            if (dictionary.contains(newString)) {
                answer.add(newString);
                dictionary.remove(newString);
            } 
            find(board, row-1, col, newTraversed, newString, len+1);
        }
        if (col > 0 && !traversed[row][col-1]) {
            boolean[][] newTraversed = new boolean[m][n];
            deepCopy(traversed, newTraversed);
            newTraversed[row][col-1] = true;
            String newString = new String(s);
            newString += board[row][col-1];
            if (dictionary.contains(newString)) {
                answer.add(newString);
                dictionary.remove(newString);
            } 
            find(board, row, col-1, newTraversed, newString, len+1);
        }
        return;
    }
    private void deepCopy(boolean[][] original, boolean[][] copy) {
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i].clone();
        }
    }
}
