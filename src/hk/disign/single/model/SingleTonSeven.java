package hk.disign.single.model;

/**
 * Created by Miller on 2019/3/19
 */
public class SingleTonSeven {
    private SingleTonSeven() {
    }
    private static SingleTonSeven singleTonSeven;
    static {
        singleTonSeven=new SingleTonSeven();
    }
    public   static SingleTonSeven getInstance(){
        return  singleTonSeven;
    }
}
