package proxy;

/**
 * @author: LiuHao
 * @Date: 2019/3/1
 * @Time: 0:06
 * @Description: LiuHao 2019/3/1 0:06
 */
public class CountProxy implements Count {
    private CountImpl countImpl;

    /**
     * 覆盖默认构造器
     *
     * @param countImpl
     */
    public CountProxy(CountImpl countImpl) {
        this.countImpl = countImpl;
    }

    @Override
    public void queryCount() {
        System.out.println("事务处理之前");
        // 调用委托类的方法;
        countImpl.queryCount();


        System.out.println("事务处理之后");
    }

    @Override
    public void updateCount() {
        System.out.println("事务处理之前");
        // 调用委托类的方法;
        countImpl.updateCount();
        System.out.println("事务处理之后");

    }
}
