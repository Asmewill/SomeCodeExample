package hk.disign.share.model;

/**
 * Created by Administrator on 2018/11/10
 * https://www.jianshu.com/p/6d1333917ae5
 */
public class MainTest {
    public static void main(String[] args) {
        ShareBikeFactory shareBikeFactory=new ShareBikeFactory();
        //��һ����ofo����Ѻ��
        IBike ofo1=shareBikeFactory.getBike("ofo");
        ofo1.ride(2);
        //��һ����mobike����Ѻ��
        IBike mobike=shareBikeFactory.getBike("mobike");
        mobike.ride(3);
        //�ڶ�����mobike������Ѻ��
        IBike ofo2=shareBikeFactory.getBike("ofo");
        ofo2.ride(4);
    }
}
