package leetcode.smallestRepunitDivByK;

import java.util.HashSet;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/29 17:24
 */
public class Solution {
        public int smallestRepunitDivByK(int K) {
            HashSet<Integer> set = new HashSet<>();
            int sum = 0;
            for (int i = 1; i <= 1000000; ++i) {
                sum = (sum * 10 + 1) % K;
                if (sum == 0)
                    return i;
                if (set.contains(sum))
                    return -1;
                set.add(sum);
            }
            return -1;
        }
}
