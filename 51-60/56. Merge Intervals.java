//Runtime: 9 ms, faster than 84.70% of Java online submissions for Merge Intervals.
//Memory Usage: 45.5 MB, less than 99.67% of Java online submissions for Merge Intervals.
class Solution {
    public int[][] merge(int[][] intervals) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(intervals, new Comparator<int[]>() {
           @Override
           public int compare(int[] o1, int[] o2) {
             return Integer.compare(o1[0], o2[0]);
           }
        });
        int lowerBound = 0;
        int upperBound = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (i == 0) {
                 lowerBound = intervals[0][0];
                 upperBound = intervals[0][1];
            }
            else if (intervals[i][0] <= upperBound) {
                if (intervals[i][1] > upperBound) upperBound = intervals[i][1];
            }
            else {
                List<Integer> temp = new ArrayList<Integer>(Arrays.asList(lowerBound, upperBound));
                list.add(temp);
                lowerBound = intervals[i][0];
                upperBound = intervals[i][1];
            }
            if (i == intervals.length - 1) {
                List<Integer> temp = new ArrayList<Integer>(Arrays.asList(lowerBound, upperBound));
                list.add(temp);
                lowerBound = intervals[i][0];
                upperBound = intervals[i][1];
            }
        }
        int[][] answer = new int[list.size()][2];
        int k = 0;
        for (List<Integer> l: list) {
            answer[k][0] = l.get(0);
            answer[k][1] = l.get(1);
            k++;
        }
        return answer;
    }
}
