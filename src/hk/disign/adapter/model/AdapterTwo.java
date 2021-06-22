package hk.disign.adapter.model;

/**
 * Created by jian.shui on 2019/1/23
 * 对象适配
 */
public class AdapterTwo implements Ps2{
    private Usber usber;
    public AdapterTwo(Usber usber) {
        this.usber = usber;
    }
    @Override
    public void isPs2() {
        usber.isUsb();
    }
}
