package leetcode.generateParenthesis;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/9 20:41
 */
public class Solution1 {
    List<String> result = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        dfs(n,n,"");
        return  result;
    }
    private void dfs(int left, int right, String curStr) {
        if(left==0 && right==0){
            result.add(curStr);
            return;
        }
        if(left>0){
            dfs(left-1,right,curStr+"(");
        }
        // 右括号还有，否则就会出现问题
        if(right> left){
            dfs(left,right-1,curStr+")");
        }
    }
    public static void main(String[] args) {
        Solution1 solution = new Solution1();
        solution.generateParenthesis(3);
    }
}
