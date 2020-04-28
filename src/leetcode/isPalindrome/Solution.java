package leetcode.isPalindrome;

import javax.jws.soap.SOAPBinding;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/9 23:34
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reverse = 0;
        while (x>reverse){
            reverse=reverse*10+x%10;
            x=x/10;
        }
        return  x == reverse || x == reverse/10;
    }

    public static void main(String[] args) {
       Solution Solution =new Solution();
        System.out.println( Solution.isPalindrome(121));
    }
}
