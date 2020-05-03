package leetcode.maxSubArray2;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/3 21:20
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int result=nums[0];
        int [] dp =new int[n];
        dp[0]=nums[0];
        for (int i = 1; i <n ; i++) {
                dp[i]=Math.max(dp[i-1],0)+nums[i];
                result=Math.max(result,dp[i]);

        }
        return  result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
