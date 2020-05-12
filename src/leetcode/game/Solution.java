package leetcode.game;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/11 19:01
 */
public class Solution {
    public int game(int[] guess, int[] answer) {
        int count=0;
        for (int i = 0; i <3 ; i++) {
             if((guess[i]&answer[i])==0){
                 count++;
             }
        }
         return  count;
    }

}
