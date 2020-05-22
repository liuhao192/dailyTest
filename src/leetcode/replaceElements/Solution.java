package leetcode.replaceElements;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/21 19:24
 */
public class Solution {
    public int[] replaceElements(int[] arr) {

        int max=-1;
        //[17,18,5,4,6,1] --> [18,6,6,6,1,-1]
        for (int i = arr.length; i >=0; i++) {
            int temp=arr[i];
            arr[i]=max;
            if(temp>max){
                max=temp;
            }
        }
  return  arr;
    }
}
