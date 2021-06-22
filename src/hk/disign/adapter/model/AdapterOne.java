package hk.disign.adapter.model;

/**
 * Created by jian.shui on 2019/1/23
 */
public class AdapterOne extends Usber implements Ps2{
    @Override
    public void isPs2() {
           isUsb();
    }
}
