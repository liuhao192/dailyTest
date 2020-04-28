package leetcode.waysToChange;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/23 17:05
 */
public class Solution {
    public int waysToChange(int n) {
        int[] coins = new int[]{1, 5, 10, 25};
        int[][] dp = new int[5][n + 1];  // 一般多开一个位置，0 空着不用
        // base case
        for (int i = 1; i <= 4; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= n; j++) {
                if (j - coins[i-1] < 0){
                    dp[i][j] = dp[i - 1][j] % 1000000007;
                } else {
                    dp[i][j] = (dp[i - 1][j] + dp[i][j - coins[i-1]]) % 1000000007;
                }
            }
        }
        return dp[4][n];
    }

    public static void main(String[] args) {
        Solution solution =new Solution();
        solution.waysToChange(5);
    }
}
