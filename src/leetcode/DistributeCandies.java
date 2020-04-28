package leetcode;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/3/5 16:05
 */
public class DistributeCandies {
    public int[] Solution(int candies, int num_people) {
        int[] ans = new int[num_people];
        int i = 0;
        while (candies > 0) {
            ans[i % num_people] += Math.min(candies, i + 1);
            candies -= Math.min(candies, i + 1);
            i += 1;
        }
        return ans;
    }


    public static void main(String[] args) {
        DistributeCandies distributeCandies = new DistributeCandies();
        int[] exist1 = distributeCandies.Solution(30, 7);
        System.out.println(exist1);
    }
}
