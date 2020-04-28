package leetcode.permute;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/25 18:39
 */
public class Solution {


    List<List<Integer>> aList = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtrack(nums,nums.length,0);
        return aList;
    }

    private void backtrack(int[] nums, int length, int i) {
        if(i == length){
            //list集合为引用数据类型 ， 所以需要临时的集合接收一下
            List<Integer> list2 = new ArrayList<>(list);
            aList.add(list2);
            return ;
        }
        for(int j = 0;j<nums.length;j++){
            if(!list.contains(nums[j])){
                list.add(nums[j]);
                backtrack(nums,length,i+1);
                list.remove(list.size()-1);
            }
        }

    }
}
