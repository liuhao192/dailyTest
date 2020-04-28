package leetcode.singleNumbers;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/28 14:21
 */
public class Solution {
   /* public int[] singleNumbers(int[] nums) {
        int sum = 0;
        int[] res = new int[2];
        for(int num : nums){
            sum ^= num;
        }
        int lowbit = sum & (-sum);
        for(int num : nums){
            if((num & lowbit) == 0){
                res[0] ^= num;
            }else{
                res[1] ^= num;
            }
        }

        return res;
    }*/
   public int singleNumber(int[] nums) {
       int sum = 0;
       for(int num : nums){
           sum ^= num;
       }
       int[] res = new int[2];
       int lowbit = sum & (-sum);
       for(int num : nums){
           if((num & lowbit) == 0){
               res[0] ^= num;
           }else{
               res[1] ^= num;
           }
       }

       return sum;
   }
    public static void main(String[] args) {
        Solution Solution =new Solution();
        System.out.println(5&-5);
        System.out.println(Solution.singleNumber(new int[]{1,2,1,3,2,5}));
    }
}
