package leetcode.getIntersectionNode;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/17 19:32
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      ListNode ha=headA;ListNode hb=headB;
      while (ha!=hb){
          ha=ha!=null?ha.next:headB;
          hb=hb!=null?hb.next:headB;
      }
      return  ha;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
