import java.text.DecimalFormat;
import java.util.Random;

/**
 * @author: LiuHao
 * @Date: 2019/8/14
 * @Time: 16:45
 * @Description: LiuHao 2019/8/14 16:45
 */
public class testRandom_generatingDoubleBounded_withRange {


    public static void main(String[] args) {
        String arr="[";
        for (int i = 0; i < 7; i ++) {
            double min = 60;
            double max = 80;
            double boundedDouble = min + new Random().nextDouble() * (max - min);
            DecimalFormat df = new DecimalFormat("0.00");
            String str = df.format(boundedDouble);
            if(i==6){
                arr+=str+"]";
            }else{
                arr+=str+",";
            }

        }

        System.out.println(arr);
    }
}
