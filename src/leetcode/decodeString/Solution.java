package decodeString;

import java.util.LinkedList;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/28 10:56
 */
public class Solution {
    //解析字符串，遇到数字进入栈，遇到[ 进入 遇到] 开始输出
    public String decodeString(String s) {
        char[] sArr= s.toCharArray();
        LinkedList<Integer> stackNum = new LinkedList<>();
        LinkedList<String> stackString = new LinkedList<>();
        int num = 0;
        StringBuffer res=new StringBuffer();
        for (char c : sArr) {
            //获取到数字
            if(Character.isDigit(c)){
                num  = num*10+Integer.parseInt(String.valueOf(c));
            } else if(c=='['){
                //将获取到的数字存入到栈，并且存入之前的字符，开始重写计数
                //stackNum和stackString stackNum[i] stackString[i]记录之前的字符串
                stackNum.add(num);
                stackString.add(res .toString());
                num=0;
                res =new StringBuffer();
            }else if(c==']'){
                StringBuffer temp=new StringBuffer();
                int temp_num=stackNum.removeLast();
                //cc
                for (int i = 0; i < temp_num; i++) {
                    temp.append(res);
                }
                //合并到acc
                res = new StringBuffer(stackString.removeLast() + temp);
            }else if(Character.isLetter(c)){
                res.append(c);
            }

        }
        return res.toString();
    }
//3[a2[c]]
    public static void main(String[] args) {
        new Solution().decodeString("3[a2[c]]");
    }
}
