package leetcode.majorityElement;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/3/13 22:59
 */
public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> countNum = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (countNum.containsKey(num)) {
                countNum.put(num,countNum.get(num)+1);
            }else{
                countNum.put(num,0);
            }
        }
        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : countNum.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }
        return majorityEntry.getKey();
    }
}
