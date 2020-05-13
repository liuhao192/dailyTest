package leetcode.maximum69Number;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/12 20:11
 */
public class Solution {
    public int maximum69Number (int num) {
        int  ten=1;
        int max=num;
        int temp=0;
        int n2=num;
        while (num!=0){
            int n=num%10;
            if(n==6){
                temp=n2 -(n -9)*ten;
            }else{
                temp=n2 -(n -6)*ten;
            }
            ten=ten*10;
            num=num/10;
            max=Math.max(max,temp);
        }
      return  max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maximum69Number(9999));
    }
}
