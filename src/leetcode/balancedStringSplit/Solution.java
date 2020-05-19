package leetcode.balancedStringSplit;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/18 12:34
 */
public class Solution {
    public int balancedStringSplit(String s) {
        int num=0;
        int n=0;
        char[] sArr=  s.toCharArray();
        for (int i = 0; i <sArr.length ; i++) {
            if(sArr[i]=='R'){
                n++;
            }
            if(sArr[i]=='L'){
                n--;
            }
            if(n==0){
                num++;
            }
        }
        return  num;
    }
}
