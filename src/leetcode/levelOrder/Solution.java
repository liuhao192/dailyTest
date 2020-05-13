package leetcode.levelOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/13 17:41
 * [3,9,20,null,null,15,7]
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 */
public class Solution {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result =new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        TreeNode node;
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer>  tempList =new ArrayList<>(size);
            while(size>0){
                node=queue.poll();
                tempList.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
                size--;
                if(size==0){
                    result.add(tempList);
                }
            }
        }
        return result;
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
