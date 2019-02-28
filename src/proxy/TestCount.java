package proxy;

/**
 * @author: LiuHao
 * @Date: 2019/3/1
 * @Time: 0:07
 * @Description: LiuHao 2019/3/1 0:07
 */
public class TestCount {
    public static void main(String[] args) {
        CountImpl countImpl = new CountImpl();
        CountProxy countProxy = new CountProxy(countImpl);
        countProxy.updateCount();
        countProxy.queryCount();

    }
}
