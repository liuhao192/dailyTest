package leetcode.swapPairs;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/3/11 23:00
 */
public class Solution {
    public String gcdOfStrings(String str1, String str2) {
            // 假设str1是N个x，str2是M个x，那么str1+str2肯定是等于str2+str1的。
            if (!(str1 + str2).equals(str2 + str1)) {
                return "";
            }
        return str1.substring(0, gcd(str1.length(), str2.length()));
        }

        private int gcd(int a, int b) {
            return b == 0? a: gcd(b, a % b);
        }

    public static void main(String[] args) {
        int[]   test=new  int[]{10,-10,10,-10,10,-10,10,-10};
        Solution solution =new Solution();

        System.out.println(solution.gcdOfStrings("ABCABCABCABCABCABC", "ABC"));
    }
}
