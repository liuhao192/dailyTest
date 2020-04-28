package leetcode.sortArray;

import java.util.Arrays;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/3/31 16:07
 */
public class Solution {

    public int[] sortArray(int[] nums) {
        int max = -50001, min = 50001;
        for (int num : nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        int[] counter = new int[max - min + 1];
        for (int num : nums) {
            counter[num - min]++;
        }

        int idx = 0;
        for (int num = min; num <= max; num++) {
            int cnt = counter[num - min];
            while (cnt-- > 0) {
                nums[idx++] = num;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        Solution Solution = new Solution();
        int[] nums = new int[]{1, 2, 2, 3, 4, 1};
        Solution.sortArray(nums);
    }
}
