//Runtime: 0 ms, faster than 100.00% of Java online submissions for Unique Paths.
//Memory Usage: 40.8 MB, less than 54.92% of Java online submissions for Unique Paths.
class Solution {
    public int uniquePaths(int m, int n) {
        int[][] paths = new int[m][n];
        paths[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= 1) paths[i][j] += paths[i-1][j];
                if (j >= 1) paths[i][j] += paths[i][j-1];
            }
        }
        return paths[m-1][n-1];
    }
}
