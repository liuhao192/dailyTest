package leetcode.validPalindrome;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/19 0:42
 */
public class Solution {
    public boolean validPalindrome(String s) {
        if(s==null||"".equals(s)){
            return false;
        }
        char[] sArr=  s.toCharArray();
        int len=sArr.length;
        int l=0;
        int r=len-1;

       while (l<r){
           if(sArr[l]!=sArr[r]){
               return (isValid(sArr,l+1,r) || isValid(sArr,l,r-1));
           }
           l++;
           r--;
       }
       return  true;

    }

    public boolean isValid( char[] s, int i, int j){
        while(i < j){
            if(s[i] != s[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.validPalindrome("deeee"));
    }
}
