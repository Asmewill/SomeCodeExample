package hk.disign.Observer.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jsxiaoshui on 2018/12/2
 */
public class WeChatServer implements Observerable {

   List<Observer>  list=new ArrayList<>();//面向接口编程

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(!list.isEmpty()){
            list.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {
        for(int i=0;i<list.size();i++){
            list.get(i).update();
        }
    }

    public void operation() {
        notifyObservers();
    }
}
