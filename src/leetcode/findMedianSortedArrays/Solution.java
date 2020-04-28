package leetcode.findMedianSortedArrays;

import java.util.Arrays;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/3/13 23:17
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int aSize=nums1.length-1;
        int bSize=nums2.length-1;
        int middle=(nums1.length+nums2.length)/2;
        int[] arr2=Arrays.copyOf(nums1,(nums1.length+nums2.length));
        int cur=0;
        int total=arr2.length-1;
        while(aSize>=0 || bSize>=0){
            if(aSize==-1){
                cur=nums2[bSize--];
            }else if(bSize==-1){
                cur=nums1[aSize--];
            }
            else if(nums1[aSize]>nums2[bSize]){
                cur=nums1[aSize--];
            }else{
                cur=nums2[bSize--];
            }
            arr2[total--]=cur;
        }
         if((arr2.length%2)!=0){
             return arr2[middle];
         }

        return (double)(arr2[middle]+arr2[middle-1])/2;
    }

    public static void main(String[] args) {

        int[]   nums1=new  int[]{1,2};
        int[]   nums2=new  int[]{3,4};
        Solution solution =new Solution();

        System.out.println(solution.findMedianSortedArrays(nums1,nums2));
    }
}
