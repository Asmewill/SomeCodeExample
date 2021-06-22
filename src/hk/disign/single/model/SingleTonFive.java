package hk.disign.single.model;

/**
 * Created by Administrator on 2018/11/10
 * https://www.cnblogs.com/android-blogs/p/5530239.html
 */
public class SingleTonFive {
    private SingleTonFive(){}
    //����ʽ
    private static SingleTonFive instance=null;
    //��ס�����
    public static SingleTonFive getInstance(){
        if(instance==null){
            synchronized (SingleTonFive.class){
                if(instance==null){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance=new SingleTonFive();
                }
          }
        }
        return instance;
    }
    //��ס����
    public static SingleTonFive getInstance1(){
        if(instance==null){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance=new SingleTonFive();
        }
        return  instance;
    }



    //����ʽ
   // https://blog.csdn.net/xlantian/article/details/80963640//�ŵ��ڲ�������
    private static SingleTonFive instance2=new SingleTonFive();
    public static SingleTonFive getInstance2(){
       return instance2;
    }

    private static  class SingleTonHolder{
        private final static SingleTonFive instance=new SingleTonFive();
    }
    public static SingleTonFive getInstance3() {
        return SingleTonHolder.instance;
    }

}
