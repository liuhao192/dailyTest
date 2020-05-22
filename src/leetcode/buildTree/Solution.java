package leetcode.buildTree;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/22 10:29
 */
public class Solution {
    int i=0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int inoLen = inorder.length;
        TreeNode buildTree= myBuildTree(preorder, inorder, 0, inoLen - 1);
        return buildTree;
    }

    private TreeNode myBuildTree(int[] preorder, int[] inorder, int start, int end) {
        //中止条件
        if (start > end) {
            return null;
        }
        int rootVal = preorder[i];
        //找到左边树的
        int left = start;
        //到底尾部
        for (int i = 0; i <= end; i++) {
            if (inorder[i] == rootVal) {
                left = i;
            }
        }
        //0 -left-1 都是左边树 右边 left+1 到 inoLen都是右边树
        i++;
        TreeNode root = new TreeNode(rootVal);
        root.left = myBuildTree(preorder, inorder, start, left-1);
        root.right = myBuildTree(preorder, inorder, left + 1, end);
        return root;
    }

    //前序遍历 preorder = [3,9,20,15,7]
//中序遍历 inorder = [9,3,15,20,7]
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.buildTree(new int[]{1,2},new int[]{2,1});
    }

}
