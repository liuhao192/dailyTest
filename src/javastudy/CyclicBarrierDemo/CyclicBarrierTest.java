package javastudy.CyclicBarrierDemo;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/5 21:44
 */
public class CyclicBarrierTest {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7, ()->{
            System.out.println(Thread.currentThread().getName()+"\t召唤神龙");
        });
        for (int i = 0; i <=7 ; i++) {
            final  int tempInt=i;
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"收集到"+tempInt+"龙珠");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            },String.valueOf(i)).start(); ;
        }
    }
}
