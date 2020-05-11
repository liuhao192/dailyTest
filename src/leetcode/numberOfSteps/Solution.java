package leetcode.numberOfSteps;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/11 19:07
 */
public class Solution {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            //偶数
            if ((num & 1) == 0) {
                num /= 2;
            } else {
                num --;
            }
            count++;
        }
        return count;
    }

}
