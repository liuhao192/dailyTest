package leetcode.maxProfit;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/3/9 16:50
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i=0;i<prices.length - 1;i++) {
            //往下执行
            for (int j= i + 1;j<prices.length;j++) {
                int differenceProfit= prices[j]-prices[i];
                if(differenceProfit>maxProfit){
                    maxProfit=differenceProfit;
                }
            }
        }
        return  maxProfit;
    }
}
