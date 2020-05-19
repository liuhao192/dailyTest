package leetcode.destCity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/17 22:12
 */
public class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> res = new HashSet<>();
        for (List<String> path : paths) {
            res.add(path.get(0));
        }

        for (List<String> path : paths) {
            String end = path.get(1);
            if (!res.contains(path.get(1))) {
                return end;
            }
        }
        return null;
    }
}
