package leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @version 版权 Copyright(c)2019 杭州恒朴电子科技有限公司
 * @ClassName:
 * @Descripton:
 * @author: liuhao
 * @date: 2020/2/12 22:27
 */
public class findRepeatNumber {

 /*   public int Solution(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            if(numsSet.contains(num)){
                return num;
            }else {
                numsSet.add(num);
            }
        }
        return -1;
    }*/


    public static int Solution(int[] nums) {
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            // nums[i] 应该放在下标为 i 的位置上
            while (nums[i] != i) {
                System.out.println(nums[i]);
                System.out.println(nums[nums[i]]);
                if (nums[i] == nums[nums[i]]) {
                    return nums[i];
                }
                swap(nums, i, nums[i]);
            }
        }
        throw new IllegalArgumentException("数组中不存在重复数字！");
    }

    private static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static void main(String[] args) {
        int[] arr =new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.println(Solution(arr));
    }
}
