package leetcode.defangIPaddr;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/12 18:42
 */
public class Solution {
    //"[.]" 代替了每个 "."。
    public String defangIPaddr(String address) {
       return  address.replace(".","[.]");
    }
}
