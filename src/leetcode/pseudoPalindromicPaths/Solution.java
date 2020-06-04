package leetcode.pseudoPalindromicPaths;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/24 11:45
 */
public class Solution {
    public static class TreeNode {
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

    int ans=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        if(root==null) return 0;
        helper(root,0);
        return ans;
    }

    void helper(TreeNode node,int temp){
        temp^=(1<<node.val);//node节点的val为几就左移几位
        if(node.left==null&&node.right==null){//判断是否叶子节点
            if(temp==0||(temp&(temp-1))==0){//判断是否为伪回文
                ans++;
            }
        }
        if(node.left!=null) helper(node.left,temp);
        if(node.right!=null) helper(node.right,temp);
        return;
    }

    private boolean check(int[] arr) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i]&1)==1) {
                cnt++;
            }
            if (cnt > 1) {
                return false;
            }

        }
        return true;
    }


    public static void main(String[] args) {
        //System.out.println(1 << 9);
        //[2,3,1,3,1,null,1]
      /*TreeNode eb = new TreeNode(1, null, null);
        TreeNode d = new TreeNode(1, null, eb);
        TreeNode c = new TreeNode(3, null, null);
        TreeNode f = new TreeNode(1, null, null);
        TreeNode a = new TreeNode(3, c, f);
        TreeNode root = new TreeNode(2, a, d);
        System.out.println(new Solution().pseudoPalindromicPaths(root));*/
        System.out.println(Math.pow(4,2));
    }
}
