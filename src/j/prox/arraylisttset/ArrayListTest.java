package j.prox.arraylisttset;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/27 23:07
 */
public class ArrayListTest {
    public static void main(String[] args) {
       // List<String> list= Collections.synchronizedList(new ArrayList<>());
       /* List<String> list=  new CopyOnWriteArrayList();
        for(int i=0;i<30;i++){
            new Thread(()-> {
                    list.add(UUID.randomUUID().toString().replace("-",""));
                System.out.println(list);
            },String.valueOf(i)).start();
        }
        list.stream().forEach(System.out::print);*/
        Lock lock= new ReentrantLock();
        try {
            lock.lock();
            System.out.println("进入锁");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}

