package Rtti;

/**
 * @author: LiuHao
 * @Date: 2019/3/3
 * @Time: 23:39
 * @Description: LiuHao 2019/3/3 23:39
 * 向上转型
 */
public class Useful {
         public void f (){
             System.out.println("Useful F");
         };
         public void g (){
             System.out.println("Useful G");
         };

    public void upUseful(Useful u) {
        System.out.println("upUseful");
    }

    public Useful() {
    }

    public static void main(String[] args) {
        Useful[] x={
                new  Useful(),
                new  MoreUseful()
        };

        x[0].f();
        x[1].f();
        x[0].upUseful(x[1]);
        ((MoreUseful) x[1]).u();
//避免  向下转型异常错误
        if (x[0] instanceof MoreUseful) {
            //向下转型异常错误
            ((MoreUseful) x[0]).u();


        }



    }
}

class  MoreUseful extends Useful{
    @Override
    public void f (){
        System.out.println("MoreUseful f");
    };
    @Override
    public void g (){
        System.out.println("MoreUseful g");
    };
    public void u (){
        System.out.println("MoreUseful u");
    };
    public void v (){};
    public void m (){};

}
