//Runtime: 3 ms, faster than 97.80% of Java online submissions for Number of Islands.
//Memory Usage: 50.8 MB, less than 91.70% of Java online submissions for Number of Islands.
class Solution {
    public int numIslands(char[][] grid) {
        int answer = 0;
        boolean[][] counted = new boolean[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1' && !counted[i][j]) {
                    answer++;
                    search(grid, i, j, counted);
                }
            }
        }
        return answer;
    }
    private void search(char[][] grid, int i, int j, boolean[][] counted) {
        counted[i][j] = true;
        if (i+1 < grid.length && !counted[i+1][j] && grid[i+1][j] == '1') {
            search(grid, i + 1, j, counted);
        }
        if (j+1 < grid[0].length && !counted[i][j+1] && grid[i][j+1] == '1') {
            search(grid, i, j + 1, counted);
        }
         if (i-1 >= 0 && !counted[i-1][j] && grid[i-1][j] == '1') {
            search(grid, i - 1, j, counted);
        }
        if (j-1 >= 0 && !counted[i][j-1] && grid[i][j-1] == '1') {
            search(grid, i, j - 1, counted);
        }
        return;
    }
}
