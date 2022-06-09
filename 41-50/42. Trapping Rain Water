/* Sort array and start from the highest wall, compute the area between the highest and second highest
wall. Repeat this process on both directions(left & right) until both directions reach the end of array
*/
class Solution {
    public int trap(int[] height) {
        int answer = 0;
        int[][] info = new int[height.length][2];
        for (int i = 0; i < height.length; i++) {
            info[i][0] = height[i];
            info[i][1] = i;
        }
        Arrays.sort(info, new Comparator<int[]>() {
    @Override
    public int compare(int[] element1, int[] element2) {
        return element2[0] - element1[0];
    }});
        int currentL = 0; // the position of left wall in info array
        int currentR = 0; // the position of right wall in info array
        while(currentL != height.length || currentR != height.length) {
            if (currentL != height.length) {
                int nextL = findWall(info, currentL, "left");
                if (nextL == height.length) currentL = nextL;
                else {
                    answer += compute(height, info, currentL, nextL);
                    currentL = nextL;
                }
            }
            if (currentR != height.length) {
                int nextR = findWall(info, currentR, "right");
                if (nextR == height.length) currentR = nextR;
                else {
                    answer += compute(height, info, currentR, nextR);
                    currentR = nextR;
                }
            }
        }
        return answer;
    }
    private int findWall(int[][] array, int position, String s) {
        int x = array[position][1];
        if (s == "left") {
            int i = position + 1;
            if (i == array.length) return i;
            while (array[i][1] >= x) {
                i++;
                if (i == array.length) break;
            }
            return i;
        }
        if (s == "right") {
            int j = position + 1;
            if (j == array.length) return j;
            while (array[j][1] <= x) {
                j++;
                if (j == array.length) break;               
            }
            return j;
        }
        return 0;
    }
    private int compute(int[] height, int[][] info, int current, int next) {
        int wall = info[next][0];  // height of shorter wall
        int left = Math.min(info[next][1], info[current][1]); // position of left wall
        int right = Math.max(info[next][1], info[current][1]);
        int width = right - left - 1;
        int minusArea = 0;
        for (int i = left + 1; i < right; i++) {
            minusArea += height[i];
        } 
        return wall*width - minusArea;
    }    
}
