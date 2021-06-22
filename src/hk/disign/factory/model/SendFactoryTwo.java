package hk.disign.factory.model;

/**
 * Created by jsxiaoshui on 2018/12/1
 */
public class SendFactoryTwo {
    public  Sender produceMail(){
       return new MailSender();
    }
    public  Sender produceSms(){
        return new SmsSender();
    }
}
