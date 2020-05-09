package leetcode.mySqrt;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/9 20:13
 */
public class Solution {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int res = 0;
        while (l <= r) {
            int mid = l + (r - 1) / 2;
            if ((long)mid * mid <= x){
                res = mid;
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mySqrt(8));
    }
}
