package hk.disign.factory.model;

/**
 * Created by jsxiaoshui on 2018/12/1
 */
public class SendFactoryOne {
    public Sender produce(String type){
        if(type.equals("mail")){
            return  new MailSender();
        }else if(type.equals("sms")){
            return  new SmsSender();
        }else{
            return null;
        }
    }
}
