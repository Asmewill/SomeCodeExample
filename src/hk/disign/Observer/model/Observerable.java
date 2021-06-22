package hk.disign.Observer.model;

/**
 * Created by jsxiaoshui on 2018/12/2
 */
public interface Observerable {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
