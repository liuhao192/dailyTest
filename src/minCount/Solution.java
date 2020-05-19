package minCount;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/18 12:12
 */
public class Solution {
    public int minCount(int[] coins) {
        //DP[i]=DP[i-1]+min[num/2,num21];
        int len = coins.length;
        if (len == 0) {
            return 0;
        }
        int res = 0;
        for (int i = 0; i < len; i++) {
            res+=(coins[i]+1) / 2;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.minCount(new int[]{4,2,1});
    }
}
