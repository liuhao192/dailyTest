package leetcode;

/**
 * @ClassName:
 * @Descripton:
 * @author: liuhao
 * @date: 2020/2/25 15:24
 */
public class MergeTwoLists {
    public ListNode Solution(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }else if(l2==null){
            return l1;
        }else if (l1.val < l2.val) {
            l1.next = Solution(l1.next, l2);
            return l1;
        }
        else {
            l2.next = Solution(l1, l2.next);
            return l2;
        }


    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }


    }
}
