class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList[] hasEdge = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            hasEdge[i] = new ArrayList<Integer>();
        }
        int[] inDegree = new int[numCourses];
        for (int i = 0; i < prerequisites.length; i++) {
            hasEdge[prerequisites[i][1]].add(prerequisites[i][0]);
            inDegree[prerequisites[i][0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) q.add(i);
        }
        int count = 0;
        while(!q.isEmpty()) {
            int course = q.poll();
            for (Integer i: (ArrayList<Integer>)hasEdge[course]) {
                inDegree[i]--;
                if (inDegree[i] == 0) q.add(i);
            }
            count++;
        }
        return count == numCourses;
    }
}
