package leetcode.addTwoNumbers;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/3/16 22:55
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = l1, q = l2, curr = result;
        int residue=0;
        while (p != null && q != null) {
            int pval = (p != null) ? p.val : 0;
            int qval = (q != null) ? q.val : 0;
            int sum = qval + pval+residue;
            residue = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if(p!=null){p=p.next;}
            if(q!=null){q=q.next;}
        }
        if (residue > 0) {
            curr.next = new ListNode(residue);
        }
        return  result.next;
}

private class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}
}
