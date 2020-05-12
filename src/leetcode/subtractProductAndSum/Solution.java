package leetcode.subtractProductAndSum;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/12 18:03
 */
public class Solution {
    //输入：n = 234
    //输出：15
    //解释：
    //各位数之积 = 2 * 3 * 4 = 24
    //各位数之和 = 2 + 3 + 4 = 9
    //结果 = 24 - 9 = 15
    //
    public int subtractProductAndSum(int n) {
       //求积
        int product=1;
        int sum=0;
        while (n!=0){
            product*=n%10;
            sum+=n%10;
            n= n/10;
        }
        return product-sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.subtractProductAndSum(234));
    }
}
