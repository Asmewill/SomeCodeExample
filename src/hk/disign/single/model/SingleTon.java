package hk.disign.single.model;

/**
 * Created by Administrator on 2018/11/10
 * https://www.cnblogs.com/hupp/p/4487521.html
 */
public class SingleTon {
    private SingleTon(){}
    private static class SingleTonHolder {
        private static SingleTon instance=new SingleTon();
    }
    public static  SingleTon getInstance(){
        return SingleTonHolder.instance;
    }
}
