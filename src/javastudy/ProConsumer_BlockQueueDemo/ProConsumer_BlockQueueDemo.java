package javastudy.ProConsumer_BlockQueueDemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/5/6 22:29
 */
class MyResSource {
    public volatile boolean flag = true;
    private final AtomicInteger atomicInteger = new AtomicInteger();
    BlockingQueue<String> blockingQueue = null;

    public MyResSource(BlockingQueue<String> blockingDeque) {
        this.blockingQueue = blockingDeque;
        System.out.println(blockingDeque.getClass().getName());
    }

    public void myProd() throws Exception {
        String data = null;
        boolean retValue;
        while (flag) {
            data = atomicInteger.getAndIncrement() + "";
            retValue = blockingQueue.offer(data, 2L, TimeUnit.SECONDS);
            if (retValue) {
                System.out.println("生成数据插入队列成功" + data);
            } else {
                System.out.println("生成数据插入队列失败" + data);
            }
            TimeUnit.SECONDS.sleep(1);
        }
            System.out.println("停止生成数据");
    }

    public void myConsumer() throws Exception {
        String result = null;
        while (flag) {
            result=blockingQueue.poll( 2L, TimeUnit.SECONDS);
            if (null==result || result.equals("")) {
                System.out.println("取出数据超时");
                return;
            }
            System.out.println("取出数据："+result);
        }
    }
}

public class ProConsumer_BlockQueueDemo {
    public static void main(String[] args) {
        MyResSource myResSource = new MyResSource(new ArrayBlockingQueue<String>(10));
        new Thread(()->{
            try {
                myResSource.myProd();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"pro").start();
        new Thread(()->{
            try {
                myResSource.myConsumer();
            } catch (Exception e) {
                e.printStackTrace();
            }
        },"Con").start();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myResSource.flag=false;
    }
}
