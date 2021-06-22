package hk.disign.Observer.model;

/**
 * Created by jsxiaoshui on 2018/12/2
 */
public class User1 implements Observer {
    @Override
    public void update() {
        System.out.println(User1.class.toString() +"has received the push message!");
    }
}
