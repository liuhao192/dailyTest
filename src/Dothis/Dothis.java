package Dothis;

/**
 * @author: LiuHao
 * @Date: 2019/3/6
 * @Time: 23:35
 * @Description: LiuHao 2019/3/6 23:35
 */
public class Dothis {
    void f(){
        System.out.println("Dothis.f() ");
    }
    public class Inner {
        public  Dothis outer() {
       return Dothis.this;
        }
    }

}
