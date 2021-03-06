class Solution {
    public int maxArea(int[] height) {
        int largestArea = 0;
        int left = 0;
        int right = height.length - 1;
        int shortHeight = 0;
        int longHeight = 0;
        while (right > left) {
            shortHeight = Math.min(height[left], height[right]);
            longHeight = Math.max(height[left], height[right]);
            int wide = right - left;
            if (shortHeight*wide > largestArea) {
                largestArea = shortHeight*wide;
            } 
            if (longHeight == height[left]) right--;
            else left++;
        }
      
        return largestArea;
    }
}
