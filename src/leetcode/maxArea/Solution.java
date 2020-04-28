package leetcode.maxArea;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/18 21:09
 */
public class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            ans = Math.max(ans, area);
            if (height[l] <= height[r]) {
                ++l;
            }
            else {
                --r;
            }
        }
        return ans;
    }


      /**  int size=height.length;
        int min=0;
        int max=0;
        for(int i=0;i<size;i++){
            for(int j = size-1; j >=0 ;j--){
                if(i<size){
                    min =Math.min(height[j],height[i]);
                    max =Math.max(max,min*(j-i));
                }
            }
        }
        return max; **/


    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
    }

}
