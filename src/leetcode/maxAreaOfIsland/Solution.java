package leetcode.maxAreaOfIsland;

import map.test;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/3/15 19:50
 */
public class Solution {
    private static int xsize = 0;
    private static int ysize = 0;
    private static int[] x = new int[]{1, -1, 0, 0};
    private static int[] y = new int[]{0, 0, 1, -1};
    public int maxAreaOfIsland(int[][] grid) {
         xsize = grid[0].length;
         ysize = grid.length;
        //循环查询坐标四周
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                //坐标为的时候查找四周
                if (grid[i][j] == 1) {
                    res=Math.max(res,dfs(i,j,grid));
                }
            }
        }
        return res;
    }

    private int dfs(int i, int j, int[][] grid) {

        //判断当前坐标是否在范围内
        if (i < 0 || j < 0 || i >=ysize || j >= xsize || grid[i][j]==0) {
          return 0;
        }
        //查询到当前输入改值为0，标识已经查过坐标
        grid[i][j]=0;
        int num = 1;
        //判断坐标的四周是否是岛屿
        //右边
        num+= dfs(i+x[0], j+y[0],  grid);
        num+= dfs(i+x[1], j+y[1],  grid);
        num+= dfs(i+x[2], j+y[2],  grid);
        num+= dfs(i+x[3], j+y[3],  grid);
        return num;
    }

    public static void main(String[] args) {
        int[][]   test=new  int[][]{{1,1,0,0,0},{1,1,0,0,0},{0,0,0,1,1},{0,0,0,1,1}};
        Solution solution =new Solution();

        System.out.println(solution.maxAreaOfIsland(test));
    }
}
