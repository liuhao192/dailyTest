package javastudy.CountDownLatchDemo;

import java.util.concurrent.CountDownLatch;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/5 21:33
 */
public class CountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 0; i <=6 ; i++) {
             new Thread(()->{
                 System.out.println(Thread.currentThread().getName()+"\t上完自习离开教室");
                 countDownLatch.countDown();
             },String.valueOf(i)).start();
        }
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName()+"\t班长离开最后关门");
    }
}
