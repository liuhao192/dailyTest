package leetcode.gcdOfStrings;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/3/9 16:50
 */
public class Solution {
    int ans = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);
        //路径=深度-1
        return ans-1;
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        } ;
        int l = depth(root.left);
        int r = depth(root.right);
        //深度
        ans = Math.max(ans, (l + r + 1));
        return Math.max(l, r) + 1;
    }


private  class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

}

}
