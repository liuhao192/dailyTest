package leetcode.myAtoi;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/3 16:06
 */
public class Solution {

    final   static Pattern FRAME_PATTERN = Pattern.compile("[-+]?[0-9]+");
    public int myAtoi(String str) {
        String strTrim = str.trim();
        Matcher matcher = FRAME_PATTERN.matcher(strTrim);
        if(matcher.lookingAt()){
            String strNum = strTrim.substring(0, matcher.end());
            try {
                return Integer.parseInt(strNum);
            } catch (NumberFormatException nfe) {
                return strNum.charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.myAtoi("91283472332");

    }
}
