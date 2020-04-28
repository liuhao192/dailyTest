package leetcode;

/**
 * @ClassName:
 * @Descripton:
 * @author: liuhao
 * @date: 2020/2/24 23:08
 */
public class ReverseList {
   /* public ListNode Solution(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }*/
    public ListNode Solution(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p = Solution(head.next);
        head.next.next = head;//P.next=head;
        head.next = null;
        return p;
    }


    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }



    }
// 1 → 2 → 3 → Ø
    public static void main(String[] args) {
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(2);
        first.next=second;
        ListNode third=new ListNode(3);
        second.next=third;
        ReverseList reverselist=new ReverseList();
        ListNode result= reverselist.Solution(first);
        System.out.println(result);

    }



}
