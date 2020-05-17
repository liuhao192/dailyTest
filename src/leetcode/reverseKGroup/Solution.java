package leetcode.reverseKGroup;

import leetcode.ReverseList;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/16 14:30
 */
//给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
//
//k 是一个正整数，它的值小于或等于链表的长度。
//
//如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
//
// 
//
//示例：
//
//给你这个链表：1->2->3->4->5
//
//当 k = 2 时，应当返回: 2->1->4->3->5
//
//当 k = 3 时，应当返回: 3->2->1->4->5
//
// 
//
//说明：
//
//你的算法只能使用常数的额外空间。
//你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
//
public class Solution {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public  ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode first = head;
        ListNode next = head;
        for (int i = 0; i < k; i++) {
            if (next != null) {
                next = next.next;
            } else {
                return head;
            }
        }
        //达到k 进行逆转  1->2
        ListNode headTmp = first;
        ListNode res = null;
        for (int i = 0; i < k; i++) {
            ListNode tpm=first.next;
            first.next=res;
            res=first;
            first=tpm;
            System.out.println("遍历"+System.identityHashCode(first));
        }
        headTmp.next=reverseKGroup(first,k);
        return  res;
    }

    public static void main(String[] args) {
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(2);
        first.next=second;
        ListNode third=new ListNode(3);
        second.next=third;
        ListNode four=new ListNode(4);
        third.next=four;
        ListNode five=new ListNode(5);
        four.next=five;
        Solution solution = new Solution();
        solution.reverseKGroup(first,3);
    }
}
