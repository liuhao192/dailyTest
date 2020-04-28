package leetcode;

/**
 * @version 版权 Copyright(c)2019 杭州恒朴电子科技有限公司
 * @ClassName:
 * @Descripton:
 * @author: liuhao
 * @date: 2020/2/22 22:32
 */
public class DeleteNode {

    public ListNode Solution(ListNode head, int val) {
        ListNode first = new ListNode(-1);
        first.next = head;
        ListNode curNode = first;
        while (curNode.next != null && curNode.next.val != val){
            curNode = curNode.next;
        }

        if (curNode.next != null){
            ListNode next = curNode.next;
            curNode.next = next.next;
            next.next = null;
        }

        return first.next;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }


    }

}
