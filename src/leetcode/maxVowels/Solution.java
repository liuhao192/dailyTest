package maxVowels;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/24 10:47
 */
public class Solution {
    public int maxVowels(String s, int k) {
        char[] sArr = s.toCharArray();
        int res = 0;
        int left = 0;
        int right = 0;
        int max = 0;
        String yuan = "aeiou";
        char[] yuanWord = new char[128];
        for (char c : yuan.toCharArray()) {
            yuanWord[c]++;
        }
        while (right < sArr.length) {
            if (yuanWord[sArr[right]] == 1) {
                res++;
            }
            right++;
            while ((right - left) ==k) {
                max = Math.max(max, res);
                if (yuanWord[sArr[left]] == 1) {
                    res--;
                }
                left++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().maxVowels("tryhard", 4));
    }
}
