package leetcode.canThreePartsEqualSum;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/3/11 22:43
 */
public class Solution {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for(int i: A){
            sum += i;
        }
        if(sum%3 != 0){
            return false;
        }
        int branchSum = 0;
        int flag = 0;
        int oneThird=sum/3;
        for(int i: A){
            branchSum += i;
            if(branchSum==oneThird){
                flag++;
                branchSum=0;
            }
        }
       return  flag>=3;
    }

    public static void main(String[] args) {
        int[]   test=new  int[]{10,-10,10,-10,10,-10,10,-10};
        Solution solution =new Solution();

        System.out.println(solution.canThreePartsEqualSum(test));
    }
}
