package j.prox.locktest;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/28 23:47o
 */
public class spinlockDemo {
    AtomicReference<Thread> atomicReference=new AtomicReference<Thread>();
    public void   myLock(){
        Thread thread =Thread.currentThread();
        System.out.println(Thread.currentThread().getName()+"come in");
        while (!atomicReference.compareAndSet(null,thread)){
        }
        System.out.println("持有锁"+Thread.currentThread().getName());
    }
    public void   unLock(){
        Thread thread =Thread.currentThread();
        atomicReference.compareAndSet(thread,null);
        System.out.println("解锁"+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        spinlockDemo spinlockDemo = new spinlockDemo();
        new Thread(new Runnable() {
            @Override
            public void run() {
                spinlockDemo.myLock();
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                spinlockDemo.unLock();
            }
        },"t1").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                spinlockDemo.myLock();
                spinlockDemo.unLock();
            }
        },"t2").start();
    }
}

