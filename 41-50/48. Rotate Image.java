//Runtime: 0 ms, faster than 100.00% of Java online submissions for Rotate Image.
//Memory Usage: 42.4 MB, less than 63.84% of Java online submissions for Rotate Image.
class Solution {
    public void rotate(int[][] matrix) {
        boolean[][] modified = new boolean[matrix.length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (modified[i][j]) continue;
                else {
                    int row = i;
                    int col = j;
                    int value = matrix[i][j];
                    int temp = 0;
                    while(!modified[row][col]) {
                        int newRow = col;
                        int newCol = matrix.length - 1 - row;
                        temp = matrix[newRow][newCol];
                        matrix[newRow][newCol] = value;
                        modified[row][col] = true;
                        value = temp;
                        row = newRow;
                        col = newCol;
                    }
                }
                
            }
        }
    }
}
