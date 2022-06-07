class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    private boolean solve(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for(char c = '1'; c <= '9'; c++){ 
                        board[i][j] = c;
                        if (valid(board, i, j)) {
                            if(solve(board)) return true;
                            else board[i][j] = '.';
                        }
                        else board[i][j] = '.';
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean valid (char[][] board, int row, int col) {
        for (int i = 0; i < 9; i++) {
            if (i == col) continue;
            if (board[row][i] == board[row][col]) return false;
        }
        for (int i = 0; i < 9; i++) {
            if (i == row) continue;
            if (board[i][col] == board[row][col]) return false;
        }
        int squareNum = (col/3) + 3*(row/3);
        for (int i = (squareNum/3)*3 ; i < 3 + (squareNum/3)*3; i++) {
            for (int j = (squareNum%3)*3; j < 3 + (squareNum%3)*3; j++) {
               if (i == row && j == col) continue;
               if (board[i][j] == board[row][col]) return false;
            }
        }
        return true;
    }
}
        
