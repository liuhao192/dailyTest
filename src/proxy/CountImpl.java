package proxy;

/**
 * @author: LiuHao
 * @Date: 2019/3/1
 * @Time: 0:05
 * @Description: LiuHao 2019/3/1 0:05
 */
public class CountImpl implements Count {

    @Override
    public void queryCount() {
        System.out.println("查看账户方法...");

    }

    @Override
    public void updateCount() {
        System.out.println("修改账户方法...");

    }
}
