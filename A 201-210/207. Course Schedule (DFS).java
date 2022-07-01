class Solution {
    boolean hasCycle = false;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean[][] hasEdge = new boolean[numCourses][numCourses];
        boolean[] visited = new boolean[numCourses];
        boolean[] marked = new boolean[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            hasEdge[prerequisites[i][1]][prerequisites[i][0]] = true;
        }
        for (int i = 0; i < hasEdge.length; i++) {
            search(hasEdge, visited, marked, i);
        }
        return !hasCycle; 
    }
    private void search(boolean[][] hasEdge, boolean[] visited, boolean[] marked, int course) {
        if (marked[course]) return;
        else if (visited[course] && !marked[course]) {
            hasCycle = true;
            return;
        } 
        else visited[course] = true;
        for (int i = 0; i < hasEdge.length; i++) {
            if (hasEdge[course][i]) search(hasEdge, visited, marked, i);
        }
        marked[course] = true;
        return;
    }
}
