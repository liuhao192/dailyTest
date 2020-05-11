package leetcode.myPow50;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/11 17:41
 */
public class Solution {
    public double myPow(double x, int n) {
        long N=n;
        return N>=0?longPow(x,N):1.0/longPow(x,-N);
    }

    public double longPow(double x, long n) {
        double ans = 1.0;
        while (n != 0) {
            if ((n & 1) != 0) {
                ans = ans * x;
            }
            x = x * x;
            n >>= 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.myPow(1.00000, 9));
    }
}
