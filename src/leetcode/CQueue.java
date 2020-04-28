package leetcode;

import java.util.LinkedList;

/**

 * @ClassName:
 * @Descripton:
 * @author: liuhao
 * @date: 2020/2/17 21:07
 */
public class CQueue {
    // 用于入列，暂存数据，相当于仓库
    private LinkedList<Integer> warehouse;
    // 用于出列，为空则先从warehouse入列，再继续出列
    private LinkedList<Integer> queue;

    public CQueue() {
        warehouse = new LinkedList<>();
        queue = new LinkedList<>();
    }

    public void appendTail(int value) {
        warehouse.push(value);
    }

    public int deleteHead() {
        // 如果queue不为空，则直接pop后返回
        if (!queue.isEmpty()) {
            return queue.pop();
        }
        // 如果queue为空，则先将warehouse的所有数据倒进来 先进后厨
        while (!warehouse.isEmpty()) {
            queue.push(warehouse.pop());
        }
        // 若队列中没有元素，deleteHead 操作返回 -1
        return queue.isEmpty() ? -1 : queue.pop();
    }

}
