package leetcode.firstUniqChar;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/20 15:24
 */
public class Solution {
    public char firstUniqChar(String s) {
        int[] hash= new int[256];
        char[]  sArr=  s.toCharArray();
        for (char c : sArr) {
            hash[c]++;
        }
        for (char c : sArr) {
           if(hash[c]==1){
               return c;
           }
        }
        return ' ';
    }
}
