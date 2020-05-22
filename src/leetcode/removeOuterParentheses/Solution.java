package leetcode.removeOuterParentheses;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/21 19:02
 */
public class Solution {
    public String removeOuterParentheses(String S) {
        if(S==null || S.length()==2){
            return  S;
        }
        char[] charArray = S.toCharArray();
        int len=0;
        StringBuffer res=new StringBuffer();
        for (char c : charArray) {
            if(c==')'){
                len--;
            }
            if(len>= 1){
                res.append(c);
            }
            if(c=='('){
                len++;
            }

        }
        return res.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeOuterParentheses("(()())(())"));
    }
}
