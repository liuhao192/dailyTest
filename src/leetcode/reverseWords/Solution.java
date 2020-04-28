package leetcode.reverseWords;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/10 17:21
 */
public class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] sArr=s.split("\\s");
        if(sArr.length==0){
            return "";
        }
        List<String> list= Arrays.asList(sArr);
        Collections.reverse(list);
        return String.join(" ",list);
    }
}
