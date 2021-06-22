package hk.disign.share.model;

/**
 * Created by jian.shui on 2019/1/24
 */
public class ShareBike implements IBike{
    private int price=2 ;

    @Override
    public void ride(int hours) {
        int total=2*hours;
        System.out.println("ride bike total spend "+total+" RMB");

    }
}
