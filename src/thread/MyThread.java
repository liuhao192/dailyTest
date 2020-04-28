package thread;

/**
 * @author: LiuHao
 * @Date: 2019/8/29
 * @Time: 6:57
 * @Description: LiuHao 2019/8/29 6:57
 */
public class MyThread extends Thread{
    private   int count = 5;

    /**
     * If this thread was constructed using a separate
     * <code>Runnable</code> run object, then that
     * <code>Runnable</code> object's <code>run</code> method is called;
     * otherwise, this method does nothing and returns.
     * <p>
     * Subclasses of <code>Thread</code> should override this method.
     *
     * @see #start()
     * @see #stop()
     * @see #Thread(ThreadGroup, Runnable, String)
     */
    @Override
  synchronized   public void run() {
        super.run();
        count--;
        System.out.println("线程开始"+this.currentThread().getName() +"计算值"+ count);

    }
}
