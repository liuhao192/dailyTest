package leetcode;

import java.util.LinkedList;

/**
 * @version 版权 Copyright(c)2019 杭州恒朴电子科技有限公司
 * @ClassName:
 * @Descripton:
 * @author: liuhao
 * @date: 2020/2/18 23:18
 */
public class MovingCount {

    private int[] dx = new int[]{-1, 1, 0, 0};
    private int[] dy = new int[]{0, 0, -1, 1};

    // 盘面上有多少行
    private int mrow;
    // 盘面上有多少列
    private int ncol;
    /**
     * 求和
     * @param num
     * @return
     */
    private int getNumBitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    private boolean isValid(int row, int col, int k) {
        return getNumBitSum(row) + getNumBitSum(col) <= k;
    }

    public int solution(int m, int n, int k) {
        mrow=m;
        ncol=n;
        LinkedList<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        boolean[][] visited = new boolean[m][n];
        visited[0][0] = true;
        int ans = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] node = queue.poll();
                int row = node[0];
                int col = node[1];
                ans++;

                for (int j = 0; j < 4; j++) {
                    int nextRow = row + dx[j];
                    int nextCol = col + dy[j];
                    if (inArea(nextRow,nextCol) && !visited[nextRow][nextCol]) {
                        if (isValid(nextRow, nextCol, k)) {
                            visited[nextRow][nextCol] = true;
                            queue.add(new int[]{nextRow, nextCol});
                            continue;
                        }
                    }
                }
            }
        }

        return ans;
    }

    private boolean inArea(int x, int y) {
        return x >= 0 && x < mrow && y >= 0 && y < ncol;
    }
    public static void main(String[] args) {
        MovingCount movingcount = new MovingCount();
        int exist1 = movingcount.solution(2, 3,1);
        System.out.println(exist1);
    }

}
