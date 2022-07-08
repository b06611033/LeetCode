class Solution {
    int answer;
    public int coinChange(int[] coins, int amount) {
        answer = Integer.MAX_VALUE;
        int count = 0;
        Arrays.sort(coins);
        combination(coins, amount, coins.length - 1, 0);
        if (answer == Integer.MAX_VALUE) return -1;
        return answer;
    }
    private void combination (int[] coins, int remaining, int type, int count) {
        if (count >= answer) return;
        if (remaining == 0) {
            answer = Math.min(answer, count);
            return;
        }
        if (remaining < 0) return;
        if (type < 0) return;
        int num = remaining/coins[type];
        for (int i = num; i >= 0; i--) {
            combination(coins, remaining - coins[type]*i, type - 1, count + i);
        }
        return;
    }
}
