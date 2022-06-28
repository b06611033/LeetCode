//Runtime: 1 ms, faster than 100.00% of Java online submissions for Best Time to Buy and Sell Stock.
//Memory Usage: 59.1 MB, less than 89.02% of Java online submissions for Best Time to Buy and Sell Stock.
class Solution {
    public int maxProfit(int[] prices) {
        int smallest = Integer.MAX_VALUE;
        int answer = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < smallest) smallest = prices[i];
            int profit = prices[i] - smallest;
            if (profit > answer) answer = profit;
        }
        return answer;
    }
}
