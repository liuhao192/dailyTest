package isPalindrome;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: dailyTestslow'fa
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/17 21:37
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {

        List<Integer> vals = new ArrayList<>();
        ListNode temp =head;
        while (temp!=null){
            vals.add(temp.val);
            temp=temp.next;
        }
        int slow=0;
        int fast=vals.size()-1;
        while (slow<fast){
            if(!vals.get(slow).equals(vals.get(fast))){
                return false;
            }
            fast--;
            slow++;

        }
        return  true;
    }

    public class ListNode {
     int val;
     ListNode next;
      ListNode(int x) { val = x; }
  }
}
