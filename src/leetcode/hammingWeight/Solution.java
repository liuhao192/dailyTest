package leetcode.hammingWeight;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/29 17:17
 */
public class Solution {
    public int hammingWeight(int n) {
    int res=0;
        for(;n!=0;n = n & (n-1)) {
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution =new Solution();
        System.out.println(solution.hammingWeight(00000000000000000000000000001011));
    }
}
