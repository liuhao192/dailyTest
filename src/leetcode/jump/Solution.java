package leetcode.jump;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/4 22:10
 */
public class Solution {
    public int jump(int[] nums) {
        int n = nums.length - 1;
        int step = 0;
        while ( n > 0) {
            for (int i = 0; i < n; i++) {
                if (i + nums[i] >= n){
                    n=i;
                    step++;
                    break;
                }
            }
        }
        return step;
}
}
