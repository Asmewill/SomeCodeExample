package hk.disign.factory.model;

/**
 * Created by jsxiaoshui on 2018/12/1
 */
public class SmsSender implements  Sender {
    @Override
    public void send() {
        System.out.println("this is sms sender");
    }
}
