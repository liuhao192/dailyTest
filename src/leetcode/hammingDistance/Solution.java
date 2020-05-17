package leetcode.hammingDistance;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/17 18:08
 */
public class Solution {
   public int hammingDistance(int x, int y) {
       int cro=x^y;
       int distance = 0;
       while (cro != 0) {
           if (cro % 2 == 1)
               distance += 1;
           cro = cro >> 1;
       }
     return  distance;
    }

}
