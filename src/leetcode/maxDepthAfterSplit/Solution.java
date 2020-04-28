package leetcode.maxDepthAfterSplit;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/1 17:47
 */
public class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        char[] sArr = seq.toCharArray();
        int[] ans = new int[seq.length()];
        int depth = 0;
        for (int i = 0; i < sArr.length; i++) {
            // 遍历到左括号，连续括号个数加 1，
            if (sArr[i] == '(') {
                depth++;
                ans[i] = depth % 2;
            } else {
                ans[i] = depth % 2;
                depth--;
            }
        }
        return ans;
    }

}
