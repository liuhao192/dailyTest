package subarraysDivByK;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/27 11:50
 */
public class Solution {
    public int subarraysDivByK(int[] A, int K) {
            Map<Integer, Integer> record = new HashMap<>();
            //考虑全部得前缀和会整除K；
            record.put(0, 1);
            int sum = 0;
            int res = 0;
            for (int i : A) {
                sum+=i;
                int module=(sum % K + K) % K;
                int same = record.getOrDefault(module,0);
                res+=  same;
                record.put(module,same+1);
            }
             return  res;
    }

    public static void main(String[] args) {
        System.out.println(11%12);
    }
}
