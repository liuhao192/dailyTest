package leetcode.isValidBST;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/5 16:33
 */
public class Solution {

    TreeNode pre = null;
    boolean flag = true;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        isBST(root);
        return flag;
    }


    private void isBST(TreeNode root) {
        if (root != null) {
            isBST(root.left);
            if (pre != null && pre.val >= root.val) {
                flag = false;
            }
            pre = root;
            isBST(root.right);
        }
    }


    // Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        //10,5,15,null,null,6,20]
        TreeNode treeNode = new TreeNode(10);
        TreeNode left = new TreeNode(5);
        TreeNode right = new TreeNode(15);
        treeNode.left = left;
        treeNode.right = right;
        TreeNode left1 = new TreeNode(6);
        TreeNode right1 = new TreeNode(20);
        right.left = left1;
        right.right = right1;
        Solution solution = new Solution();
        System.out.println(solution.isValidBST(treeNode));
    }

}
