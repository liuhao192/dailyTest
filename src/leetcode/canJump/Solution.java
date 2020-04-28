package leetcode.canJump;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/17 16:57
 */
public class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int rightmost = 0;
        for (int i = 0; i < n; i++) {
            //最远的位置
            if(i<=rightmost){
                rightmost=Math.max(rightmost,i+nums[i]);
                if(rightmost>=n-1){
                    return true;
                }
            }

        }
        return false;

    }

    public static void main(String[] args) {
        Solution solution =new Solution();
        int[] arr=new int[]{2,0};
        System.out.println( solution.canJump(arr));
    }
}
