import java.util.Random;

/**
 * @author: LiuHao
 * @Date: 2019/2/19
 * @Time: 23:49
 * @Description: LiuHao 2019/2/19 23:49
 */
public class ArraySort {

    public static void main(String[] args) {
        int [] arrayNumber = new int [6];
        System.out.println("产生随机数组：排序前");
        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = new Random().nextInt(100);
            System.out.print(arrayNumber[i]+" ");
        }
        System.out.println("进行排序");
        for (int i = 0; i < arrayNumber.length; i++) {
            int k=i;
            for (int j = i; j < arrayNumber.length; j++) {
                if( arrayNumber[k] > arrayNumber[j]){
                    k=j;
                }
            }
            //交换元素
            if(k!=i){
                int temp=arrayNumber[i];
                arrayNumber[i]=arrayNumber[k];
                arrayNumber[k]=temp;
            }
        }
        System.out.println("排序后");
        for (int i = 0; i < arrayNumber.length; i++) {
            System.out.print(arrayNumber[i]+" ");
        }
    }
}
