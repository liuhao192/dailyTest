package leetcode.isValid;

import java.util.HashMap;
import java.util.Stack;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/9 23:10
 */
public class Solution {
    private HashMap<Character, Character> mappings;
    public boolean isValid(String s) {
        char[] sArr = s.toCharArray();
        if (sArr.length % 2 != 0) {
            return false;
        }
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');

        Stack<Character> stack = new Stack<Character>();
        for (char c : sArr) {
            if (this.mappings.containsKey(c)) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }

        }
        return  stack.empty();
    }
    public static void main(String[] args) {
        Solution Solution =new Solution();
        Solution.isValid("()[]{}");
    }
}
