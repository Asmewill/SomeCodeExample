package hk.disign.factory.model;

/**
 * Created by jsxiaoshui on 2018/12/1
 */
public class MailSender implements Sender{
    @Override
    public void send() {
        System.out.println("this is mail sender");
    }
}
