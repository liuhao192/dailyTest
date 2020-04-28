package j.prox.locktest;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/28 23:04
 */
public class lockTest {
    public static void main(String[] args) {
        Lock lock= new ReentrantLock();
        lock.lock();
        lock.lock();
        try {
            System.out.println("进入锁");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
            lock.unlock();
        }
    }
}
