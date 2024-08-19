class Solution {
    public int lastStoneWeightII(int[] stones) {
        if (stones.length == 1)
            return stones[0];
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }
        int target = sum / 2;
        int[][] dp = new int[stones.length][target + 1];
        for (int j = stones[0]; j <= target; j++) {
            dp[0][j] = stones[0];
        }
        for (int i = 1; i < stones.length; i++) {
            for (int j = 0; j <= target; j++) {
                if (stones[i] > j)
                    dp[i][j] = dp[i - 1][j];
                else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - stones[i]] + stones[i]);
                }
            }
        }
        return Math.abs(sum - dp[stones.length - 1][target] * 2);
    }
}