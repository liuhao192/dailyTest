package leetcode.addTwoNumbersTwo;

import leetcode.AddTwoNumbers;

import java.util.Stack;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/14 17:00
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack s1 =new Stack();
        Stack s2 =new Stack();
        while (l1!=null){
            s1.push(l1.val);
            l1=l1.next;
        }
        while (l2!=null){
            s2.push(l2.val);
            l2=l2.next;
        }
        //计算
        int residue=0;
        ListNode result = null,node=null;
        while (!s1.empty()|| !s2.empty()||residue>0){
            int s1Val=(s1.empty())?0: (int) s1.pop();
            int s2Val=(s2.empty())?0: (int) s2.pop();
            //和

            int sum =residue+s1Val+s2Val;
            residue = sum / 10;
            node = new ListNode(sum % 10);
            node = new ListNode(sum % 10);
            node.next = result;
            result = node;
        }

        return result;
    }


    public static class ListNode {
          int val;
        ListNode next;
          ListNode(int x) { val = x; }
     }

    public static void main(String[] args) {
        Solution solution =new Solution();
        ListNode l1,l2,l3,l4,l5,l6,l7;
        l1=new ListNode(5);
        //l2=new ListNode(2);
       // l1.next=l2;
        //l3=new ListNode(4);
        //l2.next=l3;
       // l4=new ListNode(3);
        //l3.next=l4;
        l5=new ListNode(5);
       // l6=new ListNode(6);
       // l5.next=l6;
       // l7=new ListNode(4);
        //l6.next=l7;
        solution.addTwoNumbers(l1,l5);

    }
}
