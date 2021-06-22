package hk.disign.factory.model;

/**
 * Created by jsxiaoshui on 2018/12/1
 */
public class SendMailFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}
