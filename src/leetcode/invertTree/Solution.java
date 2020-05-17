package leetcode.invertTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/17 18:18
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return new TreeNode(0);
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode tep = queue.poll();
            if (tep!= null) {
                TreeNode left = tep.left;
                TreeNode right = tep.right;
                tep.left=right;
                tep.right=left;
            }
            if (tep.left != null) {
                queue.offer(tep.left);
            }
            if (tep.right != null) {
                queue.offer(tep.right);
            }
        }
      return  root;
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
