package hk.disign.strategy.model;

/**
 * Created by jian.shui on 2019/1/23
 */
public class SubStrategy implements Strategy {
    @Override
    public int calc(int num1, int num2) {
        return num1-num2;
    }
}
