package leetcode.updateMatrix;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/15 17:49
 */
public class Solution {
    public int[][] updateMatrix(int[][] matrix) {
        //判断
        int x = matrix.length;
        int y = matrix[0].length;
        if (y == 0 || x == 0) {
            return null;
        }
        Queue<int[]> queue = new ArrayDeque<int[]>();
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (matrix[i][j] == 0) {
                    queue.offer(new int[]{i, j});
                } else {
                    matrix[i][j] = -1;
                }
            }
        }
        int[] xm = new int[]{1, -1, 0, 0};
        int[] ym = new int[]{0, 0, 1, -1};
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            int i = point[0];
            int j = point[1];
            for (int k = 0; k < 4; k++) {
                int newx = i + xm[k];
                int newy = j + ym[k];
                if (newx >= 0 && newx < x && newy >= 0
                        && newy < y
                        && matrix[newx][newy] == -1) {
                    matrix[newx][newy] = matrix[i][j] + 1;
                    queue.offer(new int[]{newx, newy});
                }
            }

        }

        return matrix;
    }

    public static void main(String[] args) {
        Solution Solution =new Solution();
         int[][] direction = {{0,0,0},{0,1,0},{1,1,1}};
        Solution.updateMatrix(direction);
    }

}
