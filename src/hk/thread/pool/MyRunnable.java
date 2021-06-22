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
         * ҵ��......ʡ��
         */
        try {
            System.out.println("��ʼ�����̣߳�����");
            Thread.sleep(index*1000);
            System.out.println("�ҵ��̱߳�ʶ�ǣ�"+this.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
