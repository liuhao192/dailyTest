package leetcode;

/**

 * @ClassName:
 * @Descripton:
 * @author: liuhao
 * @date: 2020/2/19 22:47
 */
public class CuttingRope {

    public int solution(int n) {
        if(n<=3){
           return  n-1;
        }
        int mod = (int)1e9 + 7;
        long res = 1;
        while(n > 4) {
            res *= 3;
            res %= mod;
            n -= 3;
        }
        return (int)(res * n % mod);
    }

    public static void main(String[] args) {
        CuttingRope cuttingRope = new CuttingRope();
        int exist1 = cuttingRope.solution(7);
        System.out.println(exist1);
    }
}
