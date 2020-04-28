package leetcode.countCharacters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/3/17 21:39
 */
public class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c:chars.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int length = 0;

        Map<Character,Integer> tmpMap;
        for(String word:words){
            boolean flag = true;
            tmpMap = new HashMap<>();
            for(char c:word.toCharArray()){
                int count =tmpMap.getOrDefault(c,0)+1;
                if(count>map.getOrDefault(c,0)){
                    flag = false;
                    break;
                }
                tmpMap.put(c,count);
            }
            if(flag){
                length +=word.length();
            }
        }
        return length;
    }
}
