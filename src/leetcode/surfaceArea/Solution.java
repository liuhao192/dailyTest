package leetcode.surfaceArea;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/3/25 21:48
 */
public class Solution {
    public int surfaceArea(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int blocks = 0;
        int cover = 0;
        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[i].length; ++j) {
                //全部个数
                blocks+=grid[i][j];
                cover+=grid[i][j]>1?grid[i][j]-1:0;
                if(i > 0) {
                    cover += Math.min(grid[i-1][j],grid[i][j]);
                }
                if(j > 0) {
                    cover += Math.min(grid[i][j-1],grid[i][j]);
                }
            }
        }
        return blocks*6-cover*2;
    }

}
