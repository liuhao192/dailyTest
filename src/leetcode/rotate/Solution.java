package leetcode.rotate;

import java.util.Arrays;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/7 17:40
 */
public class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        //沿着中线反转
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                int tep=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]= tep;
            }
        }
        int mid = n /2 ;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < mid; ++j) {
                int tep=matrix[i][j];
                matrix[i][j]=matrix[i][n - 1 - j];
                matrix[i][n - 1 - j]= tep;
            }
        }
    }

    public static void main(String[] args) {
         int[][] direction = {{1,2,3}, {4,5,6}, {7,8,9}};
        Solution Solution =new Solution();
        Solution.rotate(direction);
    }
}
