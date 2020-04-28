package j.prox;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import j.prox.impl.Subject;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/17 21:21
 */
public class ProxyHandler implements InvocationHandler {
    private ISubject subject;

    public ProxyHandler(ISubject subject){
        this.subject=subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy.getClass().getName());
        System.out.println("before");
        Object result =method.invoke(subject,args);
        System.out.println("after");
        return result;
    }




}
