package leetcode.maxValue;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/20 15:59
 */
public class Solution {
    public int maxValue(int[][] grid) {
        int x = grid.length;
        int y = grid[0].length;
        int[][] dp = new int[x + 1][y + 1];
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + grid[i - 1][j - 1];
            }
        }
        return dp[x][y];
    }



    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxValue(new int[][]{
                {1,3,1},
                {1,5,1},
                {4,2,1}
        }));
    }


}
