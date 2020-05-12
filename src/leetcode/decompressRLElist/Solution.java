package leetcode.decompressRLElist;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/12 18:47
 */
public class Solution {
    //输入：nums = [1,2,3,4]
    //输出：[2,4,4,4]
    //解释：第一对 [1,2] 代表着 2 的出现频次为 1，所以生成数组 [2]。
    //第二对 [3,4] 代表着 4 的出现频次为 3，所以生成数组 [4,4,4]。
    //最后将它们串联到一起 [2] + [4,4,4] = [2,4,4,4]。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode-cn.com/problems/decompress-run-length-encoded-list
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public int[] decompressRLElist(int[] nums) {
        int len=0;
        for (int i = 0; i <nums.length ; i+=2) {
            len+=nums[i];
        }
        int[] result=new int[len];
        int lenSecond=0;
        for (int i = 0; i <nums.length ;) {
            int freq=nums[i++];
            int val=nums[i++];
            while (freq>0){
                result[lenSecond++]=val;
                freq--;
            }

        }
            return result;
    }

    public static void main(String[] args) {
       Solution solution = new Solution();
        System.out.println(solution.decompressRLElist(new  int[]{1,2,3,4}));
    }
}
