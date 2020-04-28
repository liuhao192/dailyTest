package leetcode.generateParenthesis;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/9 17:45
 */
public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateAll(new char[2 * n], 0, result);
        return result;
    }

    public void generateAll(char[] chars, int post, List<String> result) {
        if (post == chars.length) {
            if (isConsistent(chars)) {
                result.add(new String(chars));
            }
        }else {
            chars[post] = '(';
            generateAll(chars, post + 1, result);
            chars[post] = ')';
            generateAll(chars, post + 1, result);
        }
    }

    private boolean isConsistent(char[] chars) {
        int start = 0;
        for (char c : chars) {
            if (c=='(') {
                start++;
            }else{
                start--;
            }
            if (start < 0) {return false;};
        }
        return start == 0;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.generateParenthesis(3);
    }
}
