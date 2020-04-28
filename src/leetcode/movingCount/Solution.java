package leetcode.movingCount;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/8 22:19
 */
public class Solution {
    private int sums(int x, int y) {
        int sums = 0;
        while (x != 0) {
            sums += x % 10;
            x = x / 10;
        }
        while (y != 0) {
            sums += y % 10;
            y = y / 10;
        }
        return sums;
    }

    private static int mx, ny, ks;

    public int movingCount(int m, int n, int k) {
        int[] x = new int[]{1, 0};
        int[] y = new int[]{0, 1};
        mx = m;
        ny = n;
        ks = k;
        boolean[][] visited = new boolean[m][n];
        return dfs(0,0,sums(0,0),visited);
    }

    private int dfs(int x, int j, int sum, boolean[][] visited) {
        if ( x >= mx || j >= ny || sum>ks || visited[x][j]){
            return 0;
        }
        return 1+ dfs(x + 1, j, sums(x + 1, j), visited) + dfs(x, j + 1, sums(x, j + 1), visited);
    }

}
