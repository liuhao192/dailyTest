package j.prox.volatileTest;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/26 12:18
 */
public class volatileTest {

    public static void main(String[] args) {
        MyData addNum =new MyData();
        for(int i=0;i<20;i++){
            new Thread(() ->{
                for(int j=0;j<1000;j++){
                    addNum.addNumPlus();
                    addNum.addAtomic();
                }
            },String.valueOf(i)).start();
        }
        while (Thread.activeCount()>2){
            Thread.yield();
        }
        System.out.println(Thread.currentThread().getName()+"num"+addNum.num);
        System.out.println(Thread.currentThread().getName()+"num"+addNum.atomicInteger);
       /* new Thread(() ->{
            System.out.println(Thread.currentThread().getName()+"come in");
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            addNum.addNum60();
            System.out.println(Thread.currentThread().getName()+"update num"+addNum.num);
        },"aaa").start();

       while (addNum.num==0){

       }
        System.out.println(Thread.currentThread().getName()+"num"+addNum.num);*/
    }

}

 class MyData {
    volatile    int num=0;

     public void addNum60() {
         this.num = 60;
     }
     public void addNumPlus() {
         num++;
     }
     AtomicInteger atomicInteger =new AtomicInteger();

     public void addAtomic() {
         atomicInteger.getAndIncrement();
     }
 }
