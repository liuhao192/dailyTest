package leetcode.MinStack;

import java.util.Stack;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/12 17:01
 */
public class MinStack {

    /**
     * initialize your data structure here.
     */
    /**
     * 一个栈维护最小的值
     * 一个栈维护数据
     */
    private Stack<Integer> minData;
    private Stack<Integer> data;

    public MinStack() {
        minData = new Stack<Integer>();
        data = new Stack<Integer>() ;
    }

    public void push(int x) {
         if(minData.isEmpty() || minData.peek()>x){
             minData.push(x);
         }else{
             minData.push(minData.peek());
         }
        data.push(x);
    }

    public void pop() {
        if(!data.empty()){
            data.pop();
            minData.pop();
        }
    }

    public int top() {
        if(!data.isEmpty()){
            return data.peek();
        }
        throw  new RuntimeException("不存在数据");
    }

    public int getMin() {
        if(!minData.empty()){
           return minData.peek();
        }
        throw  new RuntimeException("不存在数据");
    }
}

