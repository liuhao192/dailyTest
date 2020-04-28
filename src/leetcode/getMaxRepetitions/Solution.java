package leetcode.getMaxRepetitions;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/19 21:35
 */
public class Solution {
    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 == 0 || len2 == 0 || n1 == 0 || n2 == 0) {
            return 0;
        }
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        //遍历s1的字符串达到s2所用个数
        int index = 0;
        int count = 0;
        //遍历字符串
        int[] countRecorder = new int[n1];
        int[] indexRecorder = new int[n1];
        for (int i = 0; i < n1; i++) {

            for (int j = 0; j < len1; ++j) {
                //匹配成功
                if (chars1[j] == chars2[index]) {
                    index++;
                }
                if (index == chars2.length) {
                    index = 0;
                    ++count;
                }
            }
            countRecorder[i] = count;
            indexRecorder[i] = index;
            for (int j = 0; j < i && indexRecorder[j] == index; ++j) {
                int preCount = countRecorder[j];
                int patternCount = ((n1 - 1 - j) / (i - j)) * (countRecorder[i] - countRecorder[j]);
                int remainCount = countRecorder[j + (n1 - 1 - j) % (i - j)] - countRecorder[j];
                return (preCount + patternCount + remainCount) / n2;
            }
        }
        return countRecorder[n1 - 1] / n2;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.getMaxRepetitions("abaacdbac", 100, "adcbd", 4);
    }

}
