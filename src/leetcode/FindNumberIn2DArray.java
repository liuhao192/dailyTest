package leetcode;

/**
 * @version 版权 Copyright(c)2019 杭州恒朴电子科技有限公司
 * @ClassName:
 * @Descripton:
 * @author: liuhao
 * @date: 2020/2/13 23:35
 */
public class FindNumberIn2DArray {

    public static  boolean Solution(int[][] matrix, int target) {
        int rows = matrix.length;
        if (rows == 0) {
            return false;
        }

        int cols = matrix[0].length;
        if (cols == 0) {
            return false;
        }
        int x = rows - 1;
        int y = 0;
        while (x >= 0) {

            while (y < cols && matrix[x][y] < target) {
                y++;
            }

            if (y < cols && matrix[x][y] == target) {
                return true;
            }

            x--;
        }
        return false;

    }

    public static void main(String[] args) {
        int[][] arr =  {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.out.println(Solution(arr,7));
    }
}
