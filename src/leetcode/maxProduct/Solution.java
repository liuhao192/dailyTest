package leetcode.maxProduct;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/18 17:50
 */
public class Solution {
    //输入: [2,3,-2,4]
    //输出: 6
    //解释: 子数组 [2,3] 有最大乘积 6。
    public int maxProduct(int[] nums) {
        int len=nums.length;
        if(len==0){
            return 0;
        }
        if(len==1){
            return nums[0];
        }
        int max=Integer.MIN_VALUE;
        int imax=1;
        int min=1;
        for (int i = 0; i < len; i++) {
            if(nums[i]<0){
                int temp=imax;
                imax=min;
                min=temp;
            }
            imax=Math.max(imax*nums[i],nums[i]);
            min=Math.min(min*nums[i],nums[i]);
            max=Math.max(max,imax);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProduct(new int[]{-2,3,-2,4}));
    }
}
