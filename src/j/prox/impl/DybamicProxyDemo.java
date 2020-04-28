package j.prox.impl;

import java.lang.reflect.Proxy;

import j.prox.ISubject;
import j.prox.ProxyHandler;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/17 21:26
 */
public class DybamicProxyDemo {
    public static void main(String[] args) {
        ISubject subJect =new Subject();
        ProxyHandler handle =new ProxyHandler(subJect);

        ISubject proxySubject= (ISubject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
                Subject.class.getInterfaces(),handle);
        proxySubject.request();
        System.out.println(proxySubject.getClass().getName());

    }
}
