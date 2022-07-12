class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new ArrayComparator());
        int upperbound = intervals[0][1];
        int count = 1;
        for (int i = 0; i < intervals.length; i++) {
            if (intervals[i][0] >= upperbound) {
                upperbound = intervals[i][1];
                count++;
            }
        }
        return intervals.length-count;
    }
}
class ArrayComparator implements Comparator<int[]> {
    public int compare(int[] a1, int[] a2) {
       return a1[1] - a2[1];
    }
}
