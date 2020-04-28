package leetcode.fib;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/22 12:24
 */
public class Solution {
    public int fib(int n) {
        if(n==0 ){
            return n;
        }
        int dp[]=new int[n+1];
        dp[1]=1;
        for(int i=2;i<=n;i++){
             dp[i]= (dp[i-1]+ dp[i-2]) % 1000000007;
        }
        return  dp[n];
    }

    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println(solution.fib(5));
    }
}
