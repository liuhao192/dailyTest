package leetcode.busyStudent;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/17 22:05
 */
public class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int len=startTime.length;
        int res=0;
        for (int i = 0; i < len; i++) {
            int start=startTime[i];
            int end=endTime[i];
            if(queryTime>=start && queryTime<=end){
                res++;
            }

        }
        return res;
    }
}
