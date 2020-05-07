package leetcode.isSubtree;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/7 14:51
 */
public class Solution {
    /**
     * 当前两个树的根节点值相等；
     * 并且，s 的左子树和 t 的左子树相等；
     * 并且，s 的右子树和 t 的右子树相等。
     */
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if(s==null){ return true;}
        if(t==null){return false;}

        return isSameTree(s.right,t) ||  isSameTree(s.right,t) || isSameTree(s,t);
    }

    private  boolean isSameTree(TreeNode s, TreeNode t){
        if(s==null && t==null){
           return true;
        }
        if(s==null || t==null){
            return false;
        }
        if(s.val!=t.val){return false;}
        return isSameTree(s.left,t.left) && isSameTree(s.right,t.right);
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
