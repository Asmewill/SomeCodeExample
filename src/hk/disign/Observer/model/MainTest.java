package hk.disign.Observer.model;

/**
 * Created by Administrator on 2018/11/10
 * https://www.cnblogs.com/luohanguo/p/7825656.html
 */
public class MainTest {
    public static void main(String[] args){
        WeChatServer server=new WeChatServer();
        User1 user1=new User1();
        User2 user2=new User2();
        server.registerObserver(user1);
        server.registerObserver(user2);
        server.operation();
    }
}
