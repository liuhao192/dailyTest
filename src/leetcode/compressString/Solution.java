package leetcode.compressString;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/3/16 22:05
 */
public class Solution {
    public String compressString(String S) {
        char[] sCharArr=S.toCharArray();
        int sLength=sCharArr.length;
        if(sLength == 0||sLength== 2 ) {return S;};
        StringBuffer sb =new StringBuffer();
        sb.append(sCharArr[0]);
        int res=1;
        for(int i=1;i<sCharArr.length;i++){
            if(sCharArr[i]==sCharArr[i-1]){
                res++;
            }else{
                sb.append(res).append(S.charAt(i));
                res=1;
            }
            if(sb.length()+1>sLength){
                return  S;
            }
        }
        return sb.append(res).toString();
    }

    public static void main(String[] args) {
       Solution solution =new Solution();

        System.out.println(solution.compressString("a"));
    }
}
