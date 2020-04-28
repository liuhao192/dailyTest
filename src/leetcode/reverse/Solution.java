package leetcode.reverse;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/9 23:01
 */
public class Solution {
    public int reverse(int x) {
        int res=0;
        while (x!=0){
            int unit=x%10;
            x=x/10;
            if (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE / 10 && unit > 7)) return 0;
            if (res < Integer.MIN_VALUE/10 || (res == Integer.MIN_VALUE / 10 && unit < -8)) return 0;
            res=res*10+unit;
        }
        return  res;

    }

    public static void main(String[] args) {
        Solution Solution =new Solution();
        Solution.reverse(-123);
    }
}
