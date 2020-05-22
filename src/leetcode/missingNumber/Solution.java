package leetcode.missingNumber;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/20 15:19
 */
public class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer>   has =new HashSet<>();
        for (int num : nums) {
            has.add(num);
        }
        int len =nums.length;
        int miss=0;
        for (int i = 0; i <len+1 ; i++) {
            if(!has.contains(i)){
                miss=i;
                break;
            }
        }
  return  miss;
    }
}
