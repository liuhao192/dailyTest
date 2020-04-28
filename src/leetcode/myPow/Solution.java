package leetcode.myPow;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/3/10 16:58
 */
public class Solution {
    public double myPow(double x, int n) {
        return pow(x, n);
    }

    public double pow(double x, int n) {
        double result = 0;
        if (n >= 0) {
            result*=x;
        }
        return result;
    }


}
