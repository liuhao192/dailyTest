package j.prox.cas;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/27 21:57
 */
public class CasTest {


    public static void main(String[] args) {
        AtomicInteger atomicInteger =new AtomicInteger(5);
        System.out.println(atomicInteger.compareAndSet(5,2019)+"目前值为:"+atomicInteger.get());
        System.out.println(atomicInteger.getAndIncrement()+"目前值为:"+atomicInteger.get());
        new ArrayList<>().add(1);
    }
}

