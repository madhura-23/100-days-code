public class day92{
    class Solution {
    public int rob(int[] nums) {
        // DP Approach using Tabulation

        int n = nums.length;

        int[][] dp = new int[n + 1][2];

        // Base case: If we've reached the end of the array (no more houses left)
        dp[n][0] = 0; // No loot possible beyond this point
        dp[n][1] = 0;

        for (int currIdx = n - 1; currIdx >= 0; currIdx--) {
            for (int canRob = 0; canRob < 2; canRob++) {
                if (canRob == 1) {
                    // if adjacent house is not roobed yet

                    // Option 1: Rob this house and move further
                    int rob = nums[currIdx] + dp[currIdx+1][0];

                    // Option 2: Skip this house and move further to rob
                    int dontRob = 0 + dp[currIdx+1][1];

                    // Store the better option (max loot)
                    dp[currIdx][canRob] = Math.max(rob, dontRob);
                } else {
                    // adjacent house is robbed already

                    // we only have option to skip this house
                    int dontRob = 0 + dp[currIdx+1][1];
                    dp[currIdx][canRob] = dontRob;
                }
            }
        }
        return dp[0][1]; // using Tabulation
    }
}
}