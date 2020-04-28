package leetcode.middleNode;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/3/23 22:07
 */
public class Solution {
    public ListNode middleNode(ListNode head) {
        int i = 0;
        ListNode cur;
        while (head.next != null) {
            i++;
        }
        int m = i / 2;
        int k = 0;
        cur = head.next;
        while (k < m) {
            k++;
            cur = cur.next;
        }

        return cur;
    }

    private class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
