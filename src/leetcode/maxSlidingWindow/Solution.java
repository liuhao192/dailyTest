package leetcode.maxSlidingWindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/20 16:34
 */
public class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return new int[0];
        }
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> queue = new ArrayDeque<>();
        for(int i = 0, j = 0; i < nums.length; i++) {
            if(!queue.isEmpty() && i - queue.peek() >= k) {
                queue.poll();
            }
            while(!queue.isEmpty() && nums[i] > nums[queue.peekLast()]) {
                queue.pollLast();
            }
            queue.offer(i);
            if(i >= k - 1) {
                res[j++] = nums[queue.peek()];
            }
        }
        return res;
    }

}
