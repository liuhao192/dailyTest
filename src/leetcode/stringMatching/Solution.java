package leetcode.stringMatching;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/13 17:58
 */
public class Solution {
    //输入：words = ["mass","as","hero","superhero"]
    //输出：["as","hero"]
    //解释："as" 是 "mass" 的子字符串，"hero" 是 "superhero" 的子字符串。
    //["hero","as"] 也是有效的答案。
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        if (words.length == 0) return list;
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            builder.append(str + ",");
        }
        String linkStr = builder.toString();
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            if (linkStr.split(str).length > 2) {
                list.add(str);
            }
        }
        return list;
    }
}
