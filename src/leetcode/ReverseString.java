package leetcode;

/**
 * @ClassName:
 * @Descripton:
 * @author: liuhao
 * @date: 2020/2/25 16:40
 */
public class ReverseString {

    // ["h","a","n","n","a","H"]

    public void Solution(char[] s) {
        int length = s.length;
        int left = 0;
        int right = length - 1;
        reverseString(s, left, right);
    }

    public void reverseString(char[] s, int left, int right) {
        if (left >= right) {
            return;
        }
        char temp;
        temp = s[left];
        s[left++] = s[right];
        s[right--] = temp;
        reverseString(s, left, right);
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        char[] s = new char[]{'h', 'a', 'n', 'n', 'a', 'H'};
        reverseString.Solution(s);
    }
}
