package leetcode.longestPalindrome;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/3/14 22:46
 */
public class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] sArr = s.toCharArray();
        for (char c : sArr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int cout = 0;
// 回字文 纯偶数 中间为奇数 附近为
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            cout += entry.getValue() / 2 * 2;
            if(entry.getValue()%2==1 && cout%2==0){
                cout ++;
            }
        }
        return  cout;
    }
    public static void main(String[] args) {

        Solution solution =new Solution();

        System.out.println(solution.longestPalindrome("abccccdd"));
    }
}
