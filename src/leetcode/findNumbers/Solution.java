package leetcode.findNumbers;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/12 18:26
 */
public class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (((nums[i] + "").length() & 1) == 0) {
                count++;
            }
        }
        return count;
    }
}
