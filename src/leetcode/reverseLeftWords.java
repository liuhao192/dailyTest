package leetcode;

/**
 * @ClassName:
 * @Descripton:
 * @author: liuhao
 * @date: 2020/2/22 23:00
 */
public class reverseLeftWords {
    public String solution(String str, int n) {
        if (str == null || str.length() < 2 || str.length() <= n) {
            return str;
        }
        char[] charArray = str.toCharArray();
        //翻转前n个
        reverse(charArray, 0, n - 1);
        //翻转后面的
        reverse(charArray, n, charArray.length - 1);
        //整体翻转
        reverse(charArray, 0, charArray.length - 1);
        return String.valueOf(charArray);
    }

    private void reverse(char[] array, int start, int end) {
        char temp = ' ';
        while (start < end) {
            temp = array[start];
            array[start++] = array[end];
            array[end--] = temp;
        }
        System.out.println(array);
    }

    public static void main(String[] args) {
        reverseLeftWords reverseLeftWords = new reverseLeftWords();
        String exist1 = reverseLeftWords.solution("lrloseumgh", 6);
        System.out.println(exist1);
    }
}
