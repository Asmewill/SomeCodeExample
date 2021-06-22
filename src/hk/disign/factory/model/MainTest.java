package hk.disign.factory.model;

/**
 * Created by Administrator on 2018/11/10
 */
public class MainTest {
    public static void main(String[] args){
        //普通工厂模式
        SendFactoryOne sendFactoryOne=new SendFactoryOne();
        sendFactoryOne.produce("mail");
        sendFactoryOne.produce("sms");
        //工厂方法模式
         SendFactoryTwo sendFactoryTwo=new SendFactoryTwo();
         sendFactoryTwo.produceMail();
         sendFactoryTwo.produceSms();
        //静态工厂方法模式
         SendFactoryThree.produceMail();
         SendFactoryThree.produceSms();
         //抽象工厂模式
         Provider provider=new SendMailFactory();
         Sender sender=provider.produce();
         sender.send();

         Provider provider1=new SendSmsFactory();
         Sender sender1=provider1.produce();
         sender1.send();
    }
}
