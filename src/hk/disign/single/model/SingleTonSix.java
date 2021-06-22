package hk.disign.single.model;

/**
 * Created by Miller on 2019/3/19
 * 枚举
 */
public enum  SingleTonSix {
    Instance;
    SingleTonSix() {
        System.out.println("init");
    }
    public void print(){
        System.out.println("ffffffffffff");
    }
}
