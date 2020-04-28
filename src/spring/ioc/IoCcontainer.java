package spring.ioc;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/3/30 23:12
 */
public class IoCcontainer {
    private Map<String, Object> beans = new ConcurrentHashMap<String, Object>();

    public Object getBean(String beanId) {
        return beans.get(beanId);
    }

    private void setBeans(Class<?> clazz,String beanId,String... paramBeanIds){
        Object[] paramValues=new  Object[paramBeanIds.length];
        for(int i=0;i<paramBeanIds.length;i++){
            paramValues[i]=getBean(paramBeanIds[i]);
        }
        Object bean=null;
        for(Constructor<?> constructor:clazz.getConstructors()){
            try {
                bean=constructor.newInstance(paramValues);
            } catch (InstantiationException e) {
            } catch (IllegalAccessException e) {
            } catch (InvocationTargetException e) {
            }
        }
        if(bean==null){
            throw  new RuntimeException("找不到合适的构造方法");
        }
        beans.put(beanId,bean);
    }

}
