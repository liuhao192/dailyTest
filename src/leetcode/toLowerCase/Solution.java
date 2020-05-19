package leetcode.toLowerCase;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/19 17:54
 */
public class Solution {
    public String toLowerCase(String str) {
//return  str.toLowerCase();
     char[] arr=   str.toCharArray();
        for (int i = 0; i <arr.length ; i++) {
            arr[i]|= 32;
        }
        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        String key="hell0";
        int h;
         int vlue=  (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
        System.out.println(vlue);
    }
}
