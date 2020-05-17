package leetcode.isSymmetric;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/17 20:54
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return false;
        }
       return isMirror(root,root);
    }

    private boolean isMirror(TreeNode q, TreeNode p) {
        if(q==null&&p==null){
            return true;
        }
        if (q == null || p == null) return false;
        return (q.val==p.val&&isMirror(q.right,p.left)&&isMirror(q.left,p.right));
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
