package leetcode.processQueries;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/13 18:14
 */
public class Solution {
    //输入：queries = [4,1,2,2], m = 4      14224 
    //输出：[3,1,2,0]
    //输入：queries = [7,5,5,8,3], m = 8
    //输出：[6,5,0,7,5]
    //对于 i=0: queries[i]=3, P=[1,2,3,4,5],
    // 3 在 P 中的位置是 2，接着我们把 3 移动到 P 的起始位置，得到 P=[3,1,2,4,5] 。
    public int[] processQueries(int[] queries, int m) {
        //定义动态数组，方便数据插入，也可用队列
        List<Integer> list = new ArrayList<>();
        //初始化P数组
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        //遍历queries
        for (int i = 0; i < queries.length; i++) {
            //遍历arr数组找数字
            for (int j = 0; j < m; j++) {
                if (queries[i] == arr[j]){
                    list.add(j);
                    //换位置，从目标位置的前一个开始移动，一直到第一个位置数字
                    int tep = arr[j];
                    for (int k = j - 1; k >= 0; k--) {
                        arr[k+1] = arr[k];
                    }
                    arr[0] = tep;
                }
            }
        }

        //处理回要求返回的类型
        int[] ints = new int[queries.length];
        for (int i = 0; i < list.size(); i++) {
            ints[i] = list.get(i);
        }
        return ints;

    }
}
