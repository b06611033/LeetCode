//Runtime: 2 ms, faster than 77.91% of Java online submissions for Insert Interval.
//Memory Usage: 44.2 MB, less than 99.50% of Java online submissions for Insert Interval.
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] answer1 = {{newInterval[0], newInterval[1]}}; 
        if (intervals.length == 0) return answer1;
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        int low = newInterval[0];
        int high = newInterval[1];
        boolean inserting = false;
        boolean inserted = false;
        int lowerBound = newInterval[0];
        int upperBound = newInterval[1];
        for (int i = 0; i < intervals.length; i++) {
            if ((low >= intervals[i][0] && low <= intervals[i][1]) || (high >= intervals[i][0] && high <= intervals[i][1]) || (low <= intervals[i][0] && high >= intervals[i][1])) {
                inserting = true;
                if (lowerBound > intervals[i][0]) lowerBound = intervals[i][0];
                if (upperBound < intervals[i][1]) upperBound = intervals[i][1];
            } 
            else if (!inserted && !inserting && high < intervals[i][0]) {
                 List<Integer> temp1 = new ArrayList<Integer>(Arrays.asList(low, high));
                 list.add(temp1);
                 List<Integer> temp2 = new ArrayList<Integer>(Arrays.asList(intervals[i][0], intervals[i][1]));
                 list.add(temp2);
                 inserted = true;
            }
            else {
                if (inserting) {
                     List<Integer> temp = new ArrayList<Integer>(Arrays.asList(lowerBound, upperBound));
                     list.add(temp);
                     inserting = false;
                     inserted = true;
                }
                List<Integer> temp = new ArrayList<Integer>(Arrays.asList(intervals[i][0], intervals[i][1]));
                list.add(temp);
            }
            if (i == intervals.length - 1 && inserting) {
                List<Integer> temp = new ArrayList<Integer>(Arrays.asList(lowerBound, upperBound));
                list.add(temp);
            }
        }
        if (!inserted && low > intervals[intervals.length - 1][1]) {
             List<Integer> temp = new ArrayList<Integer>(Arrays.asList(low, high));
             list.add(temp);
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
