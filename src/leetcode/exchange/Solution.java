package leetcode.exchange;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/20 11:58
 */
public class Solution {
    public int[] exchange(int[] nums) {
        int[] res=new int[nums.length];
        int index=0;
        for (int num : nums) {
            if((num&1)==1){
                res[index++]=num;
            }
        }

        for (int num : nums) {
            if((num&1)==0){
                res[index++]=num;
            }
        }
        return  res;

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.exchange(new int[]{1,2,3,4});
    }
}
