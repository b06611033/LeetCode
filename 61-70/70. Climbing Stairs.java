//Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
//Memory Usage: 40.9 MB, less than 49.12% of Java online submissions for Climbing Stairs.
class Solution {
    public int climbStairs(int n) {
        if (n == 1) return 1;
        int[] ways = new int[n];
        ways[0] = 1;
        ways[1] = 1;
        for (int i = 2; i < n; i++) {
            ways[i] = ways[i-1] + ways[i-2];
        }
        return ways[n-1] + ways[n-2];
    }
}
