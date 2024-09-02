class Solution {
    public int minSteps(int n) {
        if (n == 1)
            return 0;
        int[] dp = new int[n + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        dp[1] = 0;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            for (int j = 1; j < i - 1; j++) {
                if (i % j != 0)
                    continue;
                dp[i] = Math.min(dp[i], dp[j] + i / j);
            }
        }
        return dp[n];
    }
}