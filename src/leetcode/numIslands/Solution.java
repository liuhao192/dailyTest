package leetcode.numIslands;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/20 20:21
 */
public class Solution {
    private char[][] grid;
    private final int[] xd = {-1, 1, 0, 0};
    private final int[] yd = {0, 0, -1, 1};
    private int x;
    private int y;

    public int numIslands(char[][] grid) {
        x = grid.length;
        if (x == 0) {
            return 0;
        }
        y = grid[0].length;
        x = grid.length;
        this.grid = grid;
        int count = 0;
        boolean[][] visited = new boolean[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    dfs(i, j, visited);
                }
            }
        }
        return count;
    }

    private void dfs(int i, int j, boolean[][] visited) {
        visited[i][j] = true;
        for (int k = 0; k < 4; k++) {
            int newx = i + xd[k];
            int newy = j + yd[k];
            if (inArea(newx, newy) && grid[newx][newy] == '1' && !visited[newx][newy]) {
                dfs(newx, newy, visited);
            }
        }
    }

    private boolean inArea(int i, int j) {
        return i >= 0 && i < x && j >= 0 && j < y;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] grid1 = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}};
        int numIslands1 = solution.numIslands(grid1);
        System.out.println(numIslands1);

    }
}
