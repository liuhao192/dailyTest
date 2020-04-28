package j.prox.impl;

import j.prox.ISubject;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/17 21:15
 */
public class Subject  implements ISubject {
    @Override
    public void request() {
        System.out.println("目标的方法");
    }
}
