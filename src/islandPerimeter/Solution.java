package islandPerimeter;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/29 16:51
 */
public class Solution {
    public int islandPerimeter(int[][] grid) {
        int[] xf = new int[]{1, -1, 0, 0};
        int[] yf = new int[]{0, 0, 1, -1};
        int x = grid.length;
        if(x==0){
           return 0;
        }
        int y = grid[0].length;
        int res = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                if (grid[i][j] == 1) {
                    res+=4;
                    for (int k = 0; k < 4; k++) {
                        int newX = i + xf[k];
                        int newY = j + yf[k];

                        if (newX>=0 && newX <x && newY>=0 && newY<y && grid[newX][newY] == 1) {
                            res--;
                        }
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][]   test=new  int[][]{{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        Solution solution =new Solution();

        System.out.println(solution.islandPerimeter(test));
    }
}
