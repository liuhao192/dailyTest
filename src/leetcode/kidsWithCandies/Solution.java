package leetcode.kidsWithCandies;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/11 18:43
 */
public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        int len =candies.length;
        for (int i = 0; i < len; i++) {
             max=Math.max(max,candies[i]);
        }
        List<Boolean> result= new ArrayList<>(len);
        for (int i = 0; i < len; i++) {
            result.add(candies[i]+extraCandies>=max);
        }
        return  result;
    }
}
