package leetcode.merge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/16 17:19
 */
public class Solution {
    public int[][] merge(int[][] intervals) {
        int right = intervals.length;
        if (right < 2) {
            return intervals;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        for (int i = 1; i < right; i++) {
            int leftNum = intervals[i][0];
            int rightNum = intervals[i][1];
            int[] peek = res.get(res.size() - 1);
            if (leftNum > peek[1]) {
                res.add(intervals[i]);
            }else{
                peek[1]=Math.max(rightNum,peek[1]);
            }
        }
        return res.toArray(new int[res.size()][]);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] intervals = {{2, 6}, {1, 3}, {8, 10}, {15, 18}};
        int[][] res = solution.merge(intervals);
        for (int i = 0; i < res.length; i++) {
            System.out.println(Arrays.toString(res[i]));
        }
    }

}

