package leetcode.smallerNumbersThanCurrent;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/15 21:19
 */
public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] fr=new int[101];
        for (int num : nums) {
            fr[num]++;
        }
        for (int i = 1; i < fr.length; i++) {
            fr[i]=fr[i]+fr[i-1];
        }
        int[] res = new int[nums.length];
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>0){
                if (nums[i] > 0) res[i] = fr[nums[i] - 1];
            }
        }
        return res;

    }

    public static void main(String[] args) {
         Solution solution = new Solution();
       System.out.println(solution.smallerNumbersThanCurrent(new int[]{8,1,2,2,3}));
    }
}

