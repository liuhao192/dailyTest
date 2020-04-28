package leetcode.mergeKLists;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/26 17:01
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int length = lists.length;
        if(length<2){
            return lists[0];
        }

        ListNode res = null;
        for (ListNode list: lists) {
            res = merge2Lists(res, list);
        }
        return res;
    }
    private  ListNode merge2Lists(ListNode l1, ListNode l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if (l1.val < l2.val) {
            l1.next = merge2Lists(l1.next, l2);
            return l1;
        }
        l2.next = merge2Lists(l1, l2.next);
        return l2;
    }
    
     public class ListNode {
         int val;
        ListNode next;
       ListNode(int x) { val = x; }
     }

}
