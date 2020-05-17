package leetcode.findOrder;

import java.util.Stack;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/17 10:17
 */
public class Solution {
    //遍历数据
    //缓存已读课程
    //按照先进先出的输出数组
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int type = prerequisites.length;
        if (type == 0) {
            return new int[0];
        }
        int lessonLen = prerequisites[0].length;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < type; i++) {
            for (int j = lessonLen-1; j > 0; j--) {
                int tem = prerequisites[i][j];
                stack.push(tem);
                if (numCourses == tem) {
                    break;
                }
            }
        }
        int len = stack.size();
        int[] res = new int[stack.size()];
        for (int i = 0; i < len; i++) {
            res[i] = stack.pop();
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.findOrder(1,new int[][]{{1,0},{2,0},{3,1},{3,2}});
    }
}
