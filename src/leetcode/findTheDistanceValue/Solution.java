package leetcode.findTheDistanceValue;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/22 12:05
 */
public class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int arr1len=arr1.length;
        int arr2len=arr2.length;
        int count=0;
        for (int i = 0; i <arr1len ; i++) {
            boolean ok = true;
            for (int j = 0; j <arr2len ; j++) {
                    ok &= (Math.abs(arr1[i] -arr2 [j]) > d);
            }
            if(ok){
                count++;
            }
        }

        return  count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        //[4,5,8]
        //[10,9,1,8]
        //2
        solution.findTheDistanceValue(new int[]{4,5,8},new int[]{10,9,1,8},2);
    }
}
