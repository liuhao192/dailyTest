package leetcode.rob;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/17 21:23
 */
public class Solution {
    public int rob(int[] nums) {
        //0 不偷 1偷
        int len = nums.length;
        int[][] dp = new int[len+1][];
        if (nums.length > 0){
            dp[0][1] = Math.max(0,nums[0]);
        }else {
            return 0;
        }
        for (int i = 0; i < len ; i++) {
            dp[i][1] = Math.max(dp[i-1][0],dp[i-1][0]+nums[i]);
            dp[i][0] = Math.max(dp[i-1][1],dp[i-1][0]);
        }
       return Math.max(dp[len-1][1],dp[len-1][0]);
    }
}
