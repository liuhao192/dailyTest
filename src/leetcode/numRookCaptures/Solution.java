package leetcode.numRookCaptures;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/3/26 21:08
 */
public class Solution {
    public int numRookCaptures(char[][] board) {
        int cnt = 0, sx = 0, sy = 0;
        int[] x = new int[]{1, -1, 0, 0};
        int[] y = new int[]{0, 0, 1, -1};
        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                if (board[i][j] == 'R') {
                    sx = i;
                    sy = j;
                    break;
                }
            }
        }
        for (int i = 0; i < 4; ++i) {
             for(int step=0;;step++){
                 int xStep =sx+step*x[i];
                 int yStep =sy+step*y[i];
                 if(xStep<0 ||xStep>8 ||yStep<0 ||yStep>8 || board[xStep][yStep] == 'B'){
                     break;
                 }
                 if( board[xStep][yStep] == 'p'){
                     cnt++;
                 }
             }
        }

        return cnt;
    }
}
