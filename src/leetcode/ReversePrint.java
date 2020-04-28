package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @version 版权 Copyright(c)2019 杭州恒朴电子科技有限公司
 * @ClassName:
 * @Descripton:
 * @author: liuhao
 * @date: 2020/2/16 22:33
 */
public class ReversePrint {
    public static int[] Solution(ListNode head) {
        if (head == null) {
            return new int[0];
        }

        Deque<Integer> stack=new  ArrayDeque<Integer>();
        ListNode curNode = head;
        while (curNode != null) {
            stack.addLast(curNode.val);
            curNode = curNode.next;
        }

        int size = stack.size();
        int[] res = new int[size];
        for (int i = 0; i < size; i++) {
            res[i] = stack.removeLast();
        }
        return res;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }


}
