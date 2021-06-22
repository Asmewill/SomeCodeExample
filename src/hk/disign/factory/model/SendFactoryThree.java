package hk.disign.factory.model;

/**
 * Created by jsxiaoshui on 2018/12/1
 */
public class SendFactoryThree {
    public static Sender produceMail(){
       return new MailSender();
    }
    public static Sender produceSms(){
        return new SmsSender();
    }
}
