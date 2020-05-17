package leetcode.findDisappearedNumbers;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/17 19:19
 */
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        for (int num : nums) {
            temp.add(num);
        }
        List<Integer> result = new LinkedList<Integer>();
        for (int i = 1; i <= nums.length; i++) {
            if (!temp.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }
}
