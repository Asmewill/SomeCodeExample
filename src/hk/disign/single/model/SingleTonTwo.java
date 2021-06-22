package hk.disign.single.model;

/**
 * Created by Administrator on 2018/11/10
 * https://www.cnblogs.com/android-blogs/p/5530239.html
 */
public class SingleTonTwo {
    private SingleTonTwo(){}
    //����ʽ
    private static SingleTonTwo instance=null;
    //��ס�����
    public static SingleTonTwo getInstance(){
        if(instance==null){
            synchronized (SingleTonTwo.class){
                if(instance==null){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance=new SingleTonTwo();
                }
          }
        }
        return instance;
    }
    //��ס����
    public static SingleTonTwo getInstance1(){
        if(instance==null){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance=new SingleTonTwo();
        }
        return  instance;
    }



    //����ʽ
   // https://blog.csdn.net/xlantian/article/details/80963640//�ŵ��ڲ�������
    private static SingleTonTwo instance2=new SingleTonTwo();
    public static SingleTonTwo getInstance2(){
       return instance2;
    }

    private static  class SingleTonHolder{
        private final static SingleTonTwo instance=new SingleTonTwo();
    }
    public static SingleTonTwo getInstance3() {
        return SingleTonHolder.instance;
    }

}
