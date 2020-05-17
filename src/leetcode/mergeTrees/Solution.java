package leetcode.mergeTrees;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/17 17:54
 */
public class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        return  dfs(t1, t2);
    }

    private TreeNode dfs(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        t1.val += t2.val;
        t1.left=dfs(t1.left,t2.left);
        t1.right=dfs(t1.right,t2.right);
        return  t1;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
