class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] b = new boolean[10];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                int value = Character.getNumericValue(board[i][j]);
                if (b[value]) return false;
                else b[value] = true;
            }
        }
        for (int i = 0; i < 9; i++) {
            boolean[] b = new boolean[10];
            for (int j = 0; j < 9; j++) {
                if (board[j][i] == '.') continue;
                int value = Character.getNumericValue(board[j][i]);
                if (b[value]) return false;
                else b[value] = true;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boolean[] b = new boolean[10];
                for (int k = 0; k < 3; k++) {
                    for (int w =0; w < 3; w++) {
                        if (board[w + i*3][k + j*3] == '.') continue;
                        int value = Character.getNumericValue(board[w + i*3][k + j*3]);
                        if (b[value]) return false;
                        else b[value] = true;
                    }
                }
            }
        }
        return true;
    }
}
