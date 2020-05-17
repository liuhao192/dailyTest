package leetcode.moveZeroes;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/17 18:40
 */
public class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int num:nums){
            if(num!=0){
                nums[index++]=num;
            }
        }
        while(index<nums.length){
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(0 ^ 13);
    }
}
