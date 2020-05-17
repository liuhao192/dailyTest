package leetcode.subarraySum;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/15 14:54
 */
public class Solution {
    //输入:nums = [1,1,1], k = 2
    //输出: 2 , [1,1] 与 [1,1] 为两种不同的情况。
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        for (int start = 0; start < nums.length; ++start) {
            int sum = 0;
            for (int end = start; end >= 0; --end) {
                sum += nums[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }
}
