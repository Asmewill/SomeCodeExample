package hk.disign.strategy.model;

/**
 * Created by jian.shui on 2019/1/23
 */
public class Environment {
    private Strategy strategy;
    public Environment(Strategy strategy) {
        this.strategy = strategy;
    }

    public int calc(int a,int b){
        return strategy.calc(a,b);
    }
}
