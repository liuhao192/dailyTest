package leetcode.interview.maxAreaOfIsland;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/7 15:09
 */
public class Solution {
    private int mrow;
    private int ncol;
    private final int[] xD = new int[]{-1, 1, 0, 0};
    private final int[] yD = new int[]{0, 0, 1, -1};

    public int maxAreaOfIsland(int[][] grid) {
        mrow = grid.length;
        if (mrow == 0) {
            return 0;
        }
        ncol = grid[0].length;
        int res = 0;
        for (int i = 0; i < mrow ; i++) {
            for (int j = 0; j < ncol ; j++) {
                if (grid[i][j] == 1) {
                    res = Math.max(res, dfs(i, j, grid));
                }
            }
        }
        return res;
    }

    private int dfs(int i, int j, int[][] grid) {
        if (!inArea(i, j) || grid[i][j] == 0) {
            return 0;
        }
        grid[i][j] = 0;
        int res = 1;
        for (int k = 0; k < 4; k++) {
            int newX = i + xD[k];
            int newY = j + yD[k];
            res += dfs(newX, newY, grid);
        }
        return res;
    }

    private boolean inArea(int x, int y) {
        return x >= 0 && x < mrow && y >= 0 && y < ncol;
    }

    public static void main(String[] args) {
        //int[][] test = new int[][]{{1, 1, 0, 0, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 1, 1}, {0, 0, 0, 1, 1}};
        //Solution solution = new Solution();
       // System.out.println(solution.maxAreaOfIsland(test));
        System.out.println(Runtime.getRuntime().availableProcessors());

    }
}
