package leetcode.kthToLast;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/18 12:24
 */

public class Solution {
    public int kthToLast(ListNode head, int k) {
        ListNode fast=head;
        while (k>0){
            fast=fast.next;
            k--;
        }
        ListNode slow=head;
       while (fast!=null){
           slow=slow.next;
           fast=fast.next;
       }

       return slow.val;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
