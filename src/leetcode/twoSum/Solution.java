package leetcode.twoSum;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/3/12 22:59
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
           Map<Integer,Integer> numMap=new HashMap();
            for(int i=0;i< nums.length;i++){
             int difference=target-nums[i];
             if(numMap.containsKey(difference)){
               return new int[]{numMap.get(difference),i};
             }
             numMap.put(nums[i],i);
         }
            return null;
    }
}
