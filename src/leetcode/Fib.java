package leetcode;

/**
 * @ClassName:
 * @Descripton:
 * @author: liuhao
 * @date: 2020/2/17 21:22
 */
public class Fib {

    public static int Solution(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        long first = 0;
        long sec = 1;
        for (int i = 1; i <= n; i++) {
            long nval = first + sec;
            first = sec;
            sec = nval % 1000000007;
        }
        return (int)sec;
    }
    // F(N) = F(N - 1) + F(N - 2)
    public static void main(String[] args) {
        System.out.println(Solution(0));
    }
}
