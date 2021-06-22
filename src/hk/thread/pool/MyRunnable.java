package hk.thread.pool;

/**
 * Created by jian.shui on 2019/1/16
 * https://www.cnblogs.com/ljp-sun/p/6580147.html
 */
public class MyRunnable implements Runnable {
    private Integer index;

    public MyRunnable(Integer index) {
        this.index = index;
    }

    @Override
    public void run() {
        /***
         * 业务......省略
         */
        try {
            System.out.println("开始处理线程！！！");
            Thread.sleep(index*1000);
            System.out.println("我的线程标识是："+this.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
