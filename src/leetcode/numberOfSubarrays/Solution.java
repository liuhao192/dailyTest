package leetcode.numberOfSubarrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/21 16:58
 */
public class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int len =nums.length;
        if (nums.length == 0 || nums.length < k) {
            return 0;
        }
        int odd[]=new int[len+2];
        int  ans = 0, cnt = 0;
        for (int i = 0; i < len; ++i) {
            if ((nums[i] & 1)==1) {odd[++cnt] = i;};
        }
        odd[0] = -1;
        odd[++cnt] = len;
        for (int i = 1; i + k <= cnt; ++i) {
            ans += (odd[i] - odd[i - 1]) * (odd[i + k] - odd[i + k - 1]);
        }

        return ans;
    }

    public static void main(String[] args) {
        Solution solution =new Solution();
        solution.numberOfSubarrays(new int[]{1,1,2,1,1},3);
    }
}
