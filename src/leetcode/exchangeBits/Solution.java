package leetcode.exchangeBits;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/6/10 15:38
 */
public class Solution {
    public int exchangeBits(int num) {
        int odd = num & 0x55555555;
        int even = num & 0xaaaaaaaa;
        odd = odd << 1;
        even = even >>> 1;
        return odd | even;
    }
}
