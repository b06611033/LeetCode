class Solution {
    boolean[][] toPacific;
    boolean[][] toAtlantic;
    boolean[][] visited;
    int m;
    int n;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        m = heights.length;
        n = heights[0].length;
        visited = new boolean[m][n];
        toPacific = new boolean[m][n];
        toAtlantic = new boolean[m][n];
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfsP(heights, i, j, heights[i][j]);
                dfsA(heights, i, j, heights[i][j]);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (toPacific[i][j] && toAtlantic[i][j]) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(i);
                    list.add(j);
                    answer.add(list);
                }
            }
        }
        return answer;
    }
    private boolean dfsP(int[][] heights, int row, int col, int previous){
        if (row < 0 || col < 0) return true;
        else if (row >= m || col >= n) return false;
        if (visited[row][col] || previous < heights[row][col]) return false;
        else if (toPacific[row][col]) return true;
        visited[row][col] = true;
        if (dfsP(heights, row-1, col, heights[row][col]))  toPacific[row][col] = true;
        if (dfsP(heights, row+1, col, heights[row][col]))  toPacific[row][col] = true;
        if (dfsP(heights, row, col+1, heights[row][col]))  toPacific[row][col] = true;
        if (dfsP(heights, row, col-1, heights[row][col]))  toPacific[row][col] = true;
        visited[row][col] = false;
        return toPacific[row][col];
    }
    private boolean dfsA(int[][] heights, int row, int col, int previous){
        if (row < 0 || col < 0) return false;
        else if (row >= m || col >= n) return true;
        if (visited[row][col] || previous < heights[row][col]) return false;
        else if (toAtlantic[row][col]) return true;
        visited[row][col] = true;
        if (dfsA(heights, row-1, col, heights[row][col]))  toAtlantic[row][col] = true;
        if (dfsA(heights, row+1, col, heights[row][col]))  toAtlantic[row][col] = true;
        if (dfsA(heights, row, col+1, heights[row][col]))  toAtlantic[row][col] = true;
        if (dfsA(heights, row, col-1, heights[row][col]))  toAtlantic[row][col] = true;
        visited[row][col] = false;
        return toAtlantic[row][col];
    }
  
}
