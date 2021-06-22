package hk.disign.single.model;

/**
 * Created by Administrator on 2018/11/10
 * https://www.cnblogs.com/android-blogs/p/5530239.html
 */
public class SingleTonFour {
    private SingleTonFour(){}
    //����ʽ
    private static SingleTonFour instance=null;
    //��ס�����
    public static SingleTonFour getInstance(){
        if(instance==null){
            synchronized (SingleTonFour.class){
                if(instance==null){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance=new SingleTonFour();
                }
          }
        }
        return instance;
    }
    //��ס����
    public static SingleTonFour getInstance1(){
        if(instance==null){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            instance=new SingleTonFour();
        }
        return  instance;
    }



    //����ʽ
   // https://blog.csdn.net/xlantian/article/details/80963640//�ŵ��ڲ�������
    private static SingleTonFour instance2=new SingleTonFour();
    public static SingleTonFour getInstance2(){
       return instance2;
    }

    private static  class SingleTonHolder{
        private final static SingleTonFour instance=new SingleTonFour();
    }
    public static SingleTonFour getInstance3() {
        return SingleTonHolder.instance;
    }

}
