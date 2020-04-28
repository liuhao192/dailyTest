package leetcode.rightSideView;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/22 17:17
 */
public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new LinkedList<>();
       if(root==null){
          return  res;
       }
       Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        TreeNode node;
        int tmp=0;
        while (!queue.isEmpty()){
            int size = queue.size();
            while(size>0){
                node=queue.poll();
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                size--;
                if(size==0){
                    tmp=node.val;
                }
            }
            res.add(tmp);
        }
        return res;
    }


    static class TreeNode {
        final int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        //[1,2,3,null,5,null,4]
        TreeNode treeNode =new TreeNode(1);
        TreeNode treeNode1 =new TreeNode(2);
        treeNode.left=treeNode1;
        TreeNode treeNode2 =new TreeNode(3);
        treeNode.right=treeNode2;
        TreeNode treeNode4 =new TreeNode(5);
        treeNode1.right=treeNode4;
        TreeNode treeNode5 =new TreeNode(4);
        treeNode2.right=treeNode5;
        Solution solution=new Solution();
        solution.rightSideView(treeNode);
    }

}
