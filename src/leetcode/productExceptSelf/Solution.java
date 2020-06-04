package leetcode.productExceptSelf;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/6/4 12:36
 */
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] left = new int[len];
        int k = 1;
        for (int i = 0; i < len; i++) {
            left[i]= k;
            k*=nums[i];
        }
        k = 1;
        for (int i = len - 1; i >= 0; i--) {
            left[i]*=k;
            k*=nums[i];
        }
        return left;
    }

    public static void main(String[] args) {
        new Solution().productExceptSelf(new int[]{1,2,3,4});
    }
}
